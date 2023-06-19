package main.java.lesson5;

import java.util.Scanner;


public class Task01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int n = console.nextInt();

        int[] array = new int[n];
        System.out.println("заполните масив целых чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 20);
        }
        System.out.print("Вывод: ");
        int lastArray = array[array.length - 1];
        int sumArray = 0;
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
            sumArray = sumArray+array[i];
        }
        System.out.println(lastArray);
        System.out.println(sumArray+lastArray);

    }
}
