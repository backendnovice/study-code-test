package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class StringRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 시행 횟수 입력.
        final int COUNT = scanner.nextInt();

        // 2. 문자열을 분리, 반복 횟수만큼 어펜드 후 출력.
        for(int i = 0; i < COUNT; i++) {
            int count = scanner.nextInt();
            String[] strings = scanner.next().split("");
            StringBuilder sb = new StringBuilder();
            for(String string : strings) {
                for(int j = 0; j < count; j++) {
                    sb.append(string);
                }
            }
            System.out.println(sb);
        }

        scanner.close();
    }
}
