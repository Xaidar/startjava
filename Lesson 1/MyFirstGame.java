public class MyFirstGame {    
    public static void main(String[] args) {
        long userNumber = 38;
        long rndNumber = 33;

        while (userNumber != rndNumber) {
            if (userNumber > rndNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNumber--;
            } else if (userNumber < rndNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNumber++;
            } 
        }
        System.out.println("Вы угадали!");
    }
}