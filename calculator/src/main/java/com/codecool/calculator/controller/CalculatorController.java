package com.codecool.calculator.controller;

import com.codecool.calculator.model.Calculator;
import com.codecool.calculator.service.BasicCalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class CalculatorController {

    @GetMapping("/calc")
    public String index(Model model) {
        model.addAttribute("calculator", new Calculator());
        return "index";
    }

    @PostMapping("/calc")
    public String result(@ModelAttribute Calculator calculator, Model model) {
        model.addAttribute("bcs", new BasicCalculatorService(calculator));
        return "result";
    }

}
