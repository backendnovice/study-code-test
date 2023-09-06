package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AlgorithmRuntime4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = scanner.nextInt() - 1;

        double result = (count + 1) / 2 * count;

        System.out.print((long) result + "\n" + 2);

        scanner.close();
    }
}
