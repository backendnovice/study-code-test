package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class BallInBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();
        final int M = scanner.nextInt();
        int[] array = new int[N];

        for(int i = 0; i < M; i++) {
            int I = scanner.nextInt();
            int J = scanner.nextInt();
            int K = scanner.nextInt();
            for(int j = I; j <= J; j++) {
                array[j - 1] = K;
            }
        }

        scanner.close();

        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}
