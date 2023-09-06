package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AlgorithmRuntime3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        System.out.print((long) Math.pow(count, 2) + "\n" + 2);

        scanner.close();
    }
}
