package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

class GuessNumber {

    private Player playerOne = new Player();
    private Player playerTwo = new Player();

    void start() {
        String answer = "да";

        playerOne.inputName();
        playerTwo.inputName();

        while (answer.equals("да")) {
            int rndNumber = (int) (Math.random() * 3);

            playerOne.clearNumberArr();
            playerTwo.clearNumberArr();

            if (!(playerOne.play(3))) {
                playerTwo.play(3);
            }

            System.out.println("Числа, которые ввел " + playerOne.toString());
            System.out.println("Числа, которые ввел " + playerTwo.toString());

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.next();
            } while (!answer.equals("да") && !answer.equals("нет"));
        } 
    }
}