package main.java.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = 0;
        do {
            n = c.nextInt();
        }
        while (n % 3 != 0);
        System.out.println(n);
    }
}
