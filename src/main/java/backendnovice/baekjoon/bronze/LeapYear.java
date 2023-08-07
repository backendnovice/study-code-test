package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        int answer = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;
        System.out.print(answer);
    }
}
