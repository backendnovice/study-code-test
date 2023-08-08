package backendnovice.baekjoon.bronze;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.print(IntStream.rangeClosed(1, n).sum());
    }
}
