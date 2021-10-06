package by.tms.controller;

import by.tms.dao.CalculationDAOImpl;
import by.tms.entity.Operation;
import by.tms.service.CalculationService;
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
@RequestMapping("/calc")
public class CalculationController {
    @Autowired
    private CalculationService calculationService;

    @GetMapping
    public String calc(Model model){
        model.addAttribute("newOperation",new Operation());
        return "calc";
    }

    @PostMapping
    public String calc(@Valid @ModelAttribute("newOperation")Operation operation, BindingResult bindingResult , HttpSession httpSession) {
        if (bindingResult.hasErrors()){
            return "calc";
        }else {
            double result = calculationService.operate(operation);
            httpSession.setAttribute("result", result);
            return "calc";
        }
    }

}
