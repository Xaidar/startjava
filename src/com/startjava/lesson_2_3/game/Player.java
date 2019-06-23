package src.com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);
    private String name;
    private int number;

    public String inputName() {
        System.out.print("Введите имя первого игрока: ");
        name = scanner.next();
        return name;
    }

    public int inputNumber() {
        System.out.print(name + ", попробуй угадать число: ");
        number = scanner.nextInt();
        return number;
    }

    public String toString() {
        return "name: " + name + "; number:" + number; 
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
}