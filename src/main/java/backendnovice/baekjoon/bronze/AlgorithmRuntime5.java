package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AlgorithmRuntime5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long count = scanner.nextLong();

        System.out.print(count * count * count + "\n" + 3);

        scanner.close();
    }
}
