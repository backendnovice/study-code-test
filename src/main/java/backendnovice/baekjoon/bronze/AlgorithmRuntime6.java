package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AlgorithmRuntime6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();

        System.out.print(number * (number - 1) * (number - 2) / 6 + "\n" + 3);

        scanner.close();
    }
}
