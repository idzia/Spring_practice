package com.codecool.calculator.service;

import com.codecool.calculator.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicCalculatorService implements CalculatorService {

    private Calculator calculator;

    @Autowired
    public BasicCalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public double calculeteResult() {

        double result;
        switch(calculator.getOperator()) {
            case "+":
                result = calculator.getNum1() + calculator.getNum2();
                System.out.println(calculator.getNum1() + " " + calculator.getNum2() + " " + calculator.getOperator());
                break;
            case "-":
                result = calculator.getNum1() - calculator.getNum2();
                break;
            case "*":
                result = calculator.getNum1() * calculator.getNum2();
                break;
            case "/":
                result = calculator.getNum1() / calculator.getNum2();
                break;
            default:
//                throw new IllegalArgumentException("There is no such operator");
                result = 0;
        }
        return result;
    }

}
