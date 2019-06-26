package com.startjava.lesson_2_3_4.calculator;

public class Calculator2 {

    private int a;
    private int b;
    private String operator;
    private double result;

    public void setFirstNumber(int firstNumber) {
        this.a = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.b = secondNumber;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getResult(int a1, String operator1, int b1) {
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            case "^":
                result = Math.pow(a, b);
                break;
            default:
                System.out.println("Некорректный оператор!");
                break;
        }
        return result;
    }
}