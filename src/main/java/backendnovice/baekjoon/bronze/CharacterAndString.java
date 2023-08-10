package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class CharacterAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int index = scanner.nextInt() - 1;
        scanner.close();

        System.out.println(string.charAt(index));
    }
}
