package src.com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player playerOne = new Player();
    private Player playerTwo = new Player();
    private int rndNumber;
    private String answer;

    public void start() {
        answer = "да";

        playerOne.inputName();
        playerTwo.inputName();

        while (answer.equals("да")) {
            rndNumber = (int)(Math.random() * 100);

            while (true) {
                if (playerOne.inputNumber() == rndNumber) {
                    System.out.println(playerOne.getName() + ", вы выиграли!");
                    break;
                } else if (playerTwo.inputNumber() == rndNumber) {
                    System.out.println(playerTwo.getName() + ", вы выиграли!");
                    break;
                }
            }

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } 
    }
}