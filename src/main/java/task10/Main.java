package main.java.task10;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер масива - ");
        int n = console.nextInt();

        int [] array = new int[n];
        int first = 1;

        for (int i = 0; i < array.length; i++) {
            array [i] = first;
            first = first * 2;

        }
        System.out.print("Воть: ");
        int lA = array[array.length - 1];
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(lA);
    }

}
