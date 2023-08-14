package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0, y = 0, max = -1;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.print(max + "\n" + x + " " + y);
        scanner.close();
    }
}
