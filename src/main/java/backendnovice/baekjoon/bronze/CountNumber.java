package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int LENGTH = scanner.nextInt();
        int[] array = new int[LENGTH];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int search = scanner.nextInt();

        scanner.close();

        int count = 0;
        for(int number : array) {
            if(number == search) {
                count++;
            }
        }

        System.out.print(count);
    }
}
