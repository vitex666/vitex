package main.java.task10;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер масива - ");
        int n = console.nextInt();


        int[] arr = createArray(n);
        System.out.println("Воть: " + arrayToString(arr));

    }

    public static String arrayToString(int[] array) {
        int lA = array[array.length - 1];
        String arr = "";
        for (int i = 0; i < array.length - 1; i++) {
            arr = arr + array[i] + ", ";
        }
        return arr + lA;
    }

    public static String doo(String str) {
        return str;
    }

    public static int[] createArray(int n) {                    //создание масива
        int[] array = new int[n];
        int f = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = f;
            f = f * 2;
        }
        return array;
    }
}
