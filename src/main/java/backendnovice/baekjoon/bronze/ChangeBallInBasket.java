package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ChangeBallInBasket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();
        final int M = scanner.nextInt();

        int[] array = new int[N];
        for(int i = 1; i <= N; i++) {
            array[i-1] = i;
        }

        for(int i = 0; i < M; i++) {
            final int I = scanner.nextInt() - 1;
            final int J = scanner.nextInt() - 1;
            if(I != J) {
                int temp = array[I];
                array[I] = array[J];
                array[J] = temp;
            }
        }

        for(int number : array) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
