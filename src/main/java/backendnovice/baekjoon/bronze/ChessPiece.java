package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ChessPiece {
    public static void main(String[] args) {
        int[] template = new int[]{1, 1, 2, 2, 2, 8};
        int[] results = new int[6];

        // 1. 찾은 체스말을 저장한다.
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            results[i] = scanner.nextInt();
        }
        scanner.close();

        // 2. 부족한, 남는 체스말을 출력한다.
        for(int i = 0; i < 6; i++) {
            System.out.print(template[i] - results[i] + " ");
        }
    }
}
