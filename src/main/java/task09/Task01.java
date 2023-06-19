package main.java.task09;

import java.util.Scanner;


public class Task01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int n = console.nextInt();

        int[] array = createArray(n);

        System.out.print("Вывод: ");

        System.out.println(arrayToString(array));
        int sum = calculateSum(array);
        System.out.println(sum);
    }

    public static int[] createArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30) - 20);
        }
        return array;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(',');
        }
        sb.append(arr[arr.length - 1]);
        return sb.toString();
    }
}
