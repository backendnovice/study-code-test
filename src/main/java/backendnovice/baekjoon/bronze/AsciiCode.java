package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        scanner.close();

        System.out.print((int) character);
    }
}
