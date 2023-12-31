package main.java.lesson4;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LessonRanPlusN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int n = console.nextInt();

        int [] array = new int[n];
        System.out.println("заполните масив целых чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random()*20) - 10);
        }
        System.out.print("Воть: ");
        String resultString = IntStream.of(array)
                .filter(i -> i > 0)
                .mapToObj(i -> i + "")
                .collect(Collectors.joining(","));
        System.out.println(resultString);
    }
}
