package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private int number;
    private boolean isWin;
    private int[] numberArr = new int[10];

    void inputName() {
        System.out.print("Введите имя игрока: ");
        name = scanner.next();
    }

    boolean play(int rndNumber) {
        System.out.print(name + ", у вас 10 попыток: ");

        int counter = 0;
        isWin = false;

        for (int i = 0; i < numberArr.length && !isWin; i++) {
            numberArr[i] = scanner.nextInt();
            counter++;
            if (numberArr[i] == rndNumber) {
                isWin = true;
                break;
            }
        }

        if (isWin) {
            System.out.println("Игрок " + name + " угадал число " + rndNumber + " с " + counter + " попытки");
        } else {
            System.out.println("У " + name + " закончились попытки");
        }

        return isWin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumberArr(int[] numberArr) {
        this.numberArr = numberArr;
    }

    public int[] getNumberArr() {
        return numberArr;
    }

    public void clearNumberArr() {
        for (int i=0; i<numberArr.length; i++) {
            if (numberArr[i] != 0) {
                Arrays.fill(numberArr, i, i+1, 0);
            }
        }

    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(numberArr);
    }
}