package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            int price = scanner.nextInt();
            int number = scanner.nextInt();
            total -= price * number;
        }
        scanner.close();

        System.out.print((total == 0) ? "Yes" : "No");
    }
}
