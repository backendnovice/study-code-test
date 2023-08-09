package backendnovice.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int COUNT = scanner.nextInt();
        int[] array = new int[COUNT];
        for(int i = 0; i < COUNT; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.print(min + " " + max);
    }
}
