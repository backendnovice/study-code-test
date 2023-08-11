package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        final int LENGTH = string.length();

        int result = 1;
        for(int i = 0; i < Math.sqrt(LENGTH); i++) {
            char a = string.charAt(i);
            char b = string.charAt(LENGTH - (i + 1));
            if(a != b) {
                result = 0;
                break;
            }
        }
        System.out.print(result);

        scanner.close();
    }
}
