package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class DrawStar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = scanner.nextInt();
        scanner.close();

        for(int i = count; i >= 1; i--) {
            for(int j = 1; j <= count; j++) {
                sb.append((i > j) ? " " : "*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
