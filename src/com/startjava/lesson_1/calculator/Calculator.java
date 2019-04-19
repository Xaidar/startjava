public class Calculator {    
    public static void main(String[] args) {
        int a = 6;
        int b = 11;
        long result = 0;
        String operator = "^";

        if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else if (operator.equals("*")) {
            result = a * b;
        } else if (operator.equals("/")) {
            result = a / b;
        } else if (operator.equals("%")) {
            result = a % b;
        } else if (operator.equals("^")) {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }

        System.out.println("Результат: " + result);
    }
}