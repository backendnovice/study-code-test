package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ThaiYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        System.out.print(year - 543);
    }
}
