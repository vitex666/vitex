package main.java.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер масива - ");
        int n = console.nextInt();
        int t = console.nextInt();
        int[] arr = createArray(n);
        int[] arr1 = createArray(t);

        System.out.println("Результат: ");
        printArray(arr);
        printArray(arr1);
    }

    public static void printArray(int[] arr) {   //выводим весь масив в одну строку через запятую

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static int[] createArray(int n) {
        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

        }
        return arr;
    }

}
