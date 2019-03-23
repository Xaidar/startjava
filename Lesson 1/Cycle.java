public class Cycle {    
    public static void main(String[] args) {

        System.out.println("Все числа от [0, 20]: ");

        for (int i = 0; i <= 20; i++) {
            System.out.print(i + "; ");
        }

        System.out.println("\nВсе числа от [6, -6] (шаг итерации равен 2): ");

        for (int x = 6; x >= -6; x = x - 2) {
            System.out.print(x + "; ");
        }

        int j = 11;
        int sum = 0;
        do {
            sum = sum + j;
            j = j + 2;
        } while(j < 20);

        System.out.println("\nCумма всех нечетных чисел от [10, 20]: " + sum);

    }
}