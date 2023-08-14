package backendnovice.baekjoon.silver;

import java.util.Scanner;

public class Origami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        int maxX = 0, maxY = 0;
        int[] xArray = new int[count];
        int[] yArray = new int[count];
        for(int i = 0; i < count; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            xArray[i] = x;
            yArray[i] = y;
            if(x > maxX) {
                maxX = x;
            }
            if(y > maxY) {
                maxY = y;
            }
        }
        maxX += 10;
        maxY += 10;

        int[][] array = new int[maxX][maxY];
        for(int i = 0; i < count; i++) {
            int x = xArray[i];
            int y = yArray[i];
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    array[j + x][k + y] = 1;
                }
            }
        }

        int area = 0;
        for(int i = 0; i < maxX; i++) {
            for(int j = 0; j < maxY; j++) {
                if(array[i][j] == 1) {
                    area++;
                }
            }
        }

        System.out.print(area);
        scanner.close();
    }
}
