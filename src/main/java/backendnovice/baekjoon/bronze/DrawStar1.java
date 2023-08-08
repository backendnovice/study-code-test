package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class DrawStar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            sb.append("*");
            System.out.println(sb);
        }

        scanner.close();
    }
}
