package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ReverseBallInBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();
        final int M = scanner.nextInt();

        // 1. 바구니에 순서대로 공 번호를 부여한다.
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = i + 1;
        }

        // 2. 바구니의 공을 교체한다.
        for(int i = 1; i <= M; i++) {
            int I = scanner.nextInt() - 1;
            int J = scanner.nextInt() - 1;

            if(I != J) {
                for(int j = I; j < J; j++) {
                    int temp = array[j];
                    array[j] = array[J];
                    array[J] = temp;
                    J--;
                }
            }
        }

        // 3. 바구니를 출력한다.
        for(int number : array) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
