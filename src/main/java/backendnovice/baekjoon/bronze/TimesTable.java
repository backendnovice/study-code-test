package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for(int i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
