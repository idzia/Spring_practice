package com.codecool.calculator.model;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private double num1;
    private double num2;
    private String operator;

    public Calculator() {
    }

//    public Calculator(double num1, double num2, String operator) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.operator = operator;
//    }

    public double getNum1() {return num1;}

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


}
