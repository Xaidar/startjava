import java.util.Scanner;

public class CalculatorTest { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Введите первое число: ");
        int firstNumber = sc.nextInt();
        calc.setFirstNumber(firstNumber);

        Scanner scLine = new Scanner(System.in);
        System.out.print("Введите знак математической операции: ");
        String operator = sc.next();
        calc.setOperator(operator);

        System.out.print("Введите второе число: ");
        int secondNumber = sc.nextInt();
        calc.setSecondNumber(secondNumber);

        System.out.println("Результат: " + calc.getResult());
    }
}