package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] result = new int[n][m];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    result[j][k] += scanner.nextInt();
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
