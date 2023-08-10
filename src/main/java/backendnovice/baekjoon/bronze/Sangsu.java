package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Sangsu {
    private static int reverse(String string) {
        StringBuilder sb = new StringBuilder();
        return Integer.parseInt(sb.append(string).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = reverse(scanner.next());
        int b = reverse(scanner.next());

        System.out.print(Math.max(a, b));

        scanner.close();
    }
}
