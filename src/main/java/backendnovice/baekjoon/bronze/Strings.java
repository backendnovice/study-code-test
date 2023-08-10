package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int COUNT = scanner.nextInt();
        for(int i = 0; i < COUNT; i++) {
            String string = scanner.next();
            char firstChar = string.charAt(0);
            char finalChar = string.charAt(string.length() - 1);
            System.out.println(firstChar + "" + finalChar);
        }

        scanner.close();
    }
}
