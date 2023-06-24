package main.java.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер масива - ");
        int n = console.nextInt();
        int[] arr = createArray(n);
        System.out.println("Результат: " + arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {   //выводим весь масив в одну строку через запятую

        String a = "";
        for (int i = 0; i < arr.length - 1; i++) {
            a = a + arr[i] + ", ";
        }
        return a + arr[arr.length - 1];
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
