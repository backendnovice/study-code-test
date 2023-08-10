package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class GetStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();
        System.out.print(string.length());
    }
}
