package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ASumB_EOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }

        scanner.close();
    }
}
