package by.tms.controller;

import by.tms.entity.User;
import by.tms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/reg") //localhost:8080/user/reg GET
    public String reg(Model model){
        model.addAttribute("newUser", new User());
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(@Valid @ModelAttribute("newUser") User user, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()) {
            return "reg";
        } else {
            userService.save(user);
            return "redirect:/";
        }
    }



    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(User user, Model model, HttpSession httpSession){
        User byUsername = userService.findByUsername(user.getUsername());
        if (byUsername != null){
            if (byUsername.getPassword().equals(user.getPassword())){
                httpSession.setAttribute("user", byUsername);
                return "redirect:/";
            } else {
                model.addAttribute("message", "Wrong password!");
            }
        } else {
            model.addAttribute("message", "User not found!");
        }
        return "auth";
    }

    @GetMapping("/out")
    public String out(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

}
