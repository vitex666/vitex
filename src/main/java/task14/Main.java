package main.java.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Вы ввели: ");

        boolean isEnd = false;
        while (!isEnd) {
            String str = console.nextLine();
            isEnd = str.equals("end");
            sb.append(" " + str);
        }
        System.out.println(sb.toString());

    }
}
