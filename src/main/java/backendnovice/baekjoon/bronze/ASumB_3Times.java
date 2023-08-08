package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ASumB_3Times {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            answer.append(a + b + "\n");
        }
        scanner.close();

        System.out.print(answer);
    }
}
