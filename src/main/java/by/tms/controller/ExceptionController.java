package by.tms.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Throwable.class)
    public String ex(RuntimeException re, Model model){
        model.addAttribute("message",re.getMessage());
        return "user";
    }
}
