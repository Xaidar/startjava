package com.startjava.lesson_2_3_4.array;

public class ArrayTest {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        float[] numbers1 = {1.1f, 2.2f, 3.3f};

        System.out.println(numbers.length);
        System.out.println(numbers1.length);


        for (float number : numbers1) {
            System.out.print(number + "; ");
        }

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = i * 10;
        }

        for (int number : numbers) {
            System.out.print(number + "; ");
        }

        String[] text = new String[3];

        for (String string : text) {
            System.out.print(string + "; ");
        }

    }
}
