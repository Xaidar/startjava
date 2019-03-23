public class Cycle {    
    public static void main(String[] args) {
        System.out.println("Все числа от [0, 20]: ");
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + "; ");
        }

        System.out.println("\nВсе числа от [6, -6] (шаг итерации равен 2): ");
        int x = 6;
        while (x >= -6) {
            System.out.print(x + "; ");
            x = x - 2;
        }

        int j = 10;
        int sum = 0;
        do {
            if (j%2 != 0) {
                sum = sum + j;
            }
            j = j + 1;
        } while (j < 20);
        System.out.println("\nCумма всех нечетных чисел от [10, 20]: " + sum);
    }
}