package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int COUNT = scanner.nextInt();
        String string = scanner.next();

        int total = 0;
        for(int i = 0; i < COUNT; i++) {
            char character = string.charAt(i);
            total += Character.getNumericValue(character);
        }

        System.out.print(total);
        scanner.close();
    }
}
