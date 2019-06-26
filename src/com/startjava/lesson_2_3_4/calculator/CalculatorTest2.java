package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calc = new Calculator2();

        int maxLength = 3;
        String[] text = new String[maxLength];

        System.out.print("Введите математическое выражение: ");

        for (int i = 0; i < maxLength; i++) {
            text[i] = sc.next();
        }

        int firstNumber = Integer.parseInt(text[0]);
        String operator = text[1];
        int secondNumber = Integer.parseInt(text[2]);

        System.out.println("Результат: " + calc.getResult(firstNumber, operator, secondNumber));
    }
}