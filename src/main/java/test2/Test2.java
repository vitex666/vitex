package main.java.test2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int n = console.nextInt();

        int [] array = new int[n];
        System.out.print("заполните масив целых чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        System.out.println("Воть:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
