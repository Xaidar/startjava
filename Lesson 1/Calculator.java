public class Calculator {    
    public static void main(String[] args) {

        int a = 6;
        int b = 11;
        long c = 0;
        String oper = "^";

        if (oper.equals("+")) {
            c = a + b;
        } else if (oper.equals("-")) {
            c = a - b;
        } else if (oper.equals("*")) {
            c = a * b;
        } else if (oper.equals("/")) {
            c = a / b;
        } else if (oper.equals("%")) {
            c = a % b;
        } else if (oper.equals("^")) {
            c = 1;
            for (int i = 0; i < b; i++) {
                c = c * a;
            }
        }

        System.out.println("Результат: " + c);

    }
}