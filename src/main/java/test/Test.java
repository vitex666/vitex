package main.java.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество повторений - ");
        int n = console.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Волгоград - лучший город на земле");
        }
    }
}
