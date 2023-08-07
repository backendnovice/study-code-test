package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class SelectQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int quadrant = 0;
        if(x > 0) {
            quadrant = (y > 0) ? 1 : 4;
        }else {
            quadrant = (y > 0) ? 2 : 3;
        }

        System.out.print(quadrant);
    }
}
