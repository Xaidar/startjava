package src.com.startjava.lesson_2_3.calculator;

public class Calculator {    

    private int a;
    private int b;
    private String operator;
    private long result;

    public void setFirstNumber(int firstNumber) {
        this.a = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.b = secondNumber;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public long getResult() {
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
                pow();
                break;
            default: 
                System.out.println("Некорректный оператор!");
                break;
        }
        return result;
    }

    private void pow() {
        result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
    }
}