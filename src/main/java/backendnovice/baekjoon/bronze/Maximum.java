package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LENGTH = 9;
        int[] array = new int[LENGTH];
        int max = 0, idx = 0;
        for(int i = 0; i < array.length; i++) {
            int num = scanner.nextInt();
            if(num > max) {
                max = num;
                idx = i + 1;
            }
        }

        System.out.print(max + "\n" + idx);
    }
}
