public class MyFirstGame {    
    public static void main(String[] args) {

    	long userNumber = 38;
    	long rndNumber = 33;
    	boolean win = false;

    	int i = 0;
    	while (win == false) {

    		if (userNumber > rndNumber) {
    			System.out.println("Введенное вами число больше того, что загадал компьютер");
    			win = false;
    			userNumber--;
    		} else if (userNumber < rndNumber) {
    			System.out.println("Введенное вами число меньше того, что загадал компьютер");
    			win = false;
    			userNumber++;
    		} else if (userNumber == rndNumber) {
    			System.out.println("Вы угадали!");
    			win = true;
    		}

    	}
        
    }
}