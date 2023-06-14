package main.java.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Введите количество повторений" + n);
        for (int i = 0; i < n; i++) {
            System.out.println("Волгогра - лучший город на земле");
        }
    }
}
