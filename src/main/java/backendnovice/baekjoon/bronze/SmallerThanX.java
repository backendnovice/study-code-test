package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class SmallerThanX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LENGTH = scanner.nextInt();
        final int X = scanner.nextInt();

        for(int i = 0; i < LENGTH; i++) {
            int number = scanner.nextInt();
            if(number < X) {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }
}
