package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class SnailClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int height = scanner.nextInt();

        int day = (height - down) / (up - down);

        if((height - down) % (up - down) != 0) {
            day++;
        }

        System.out.print(day);
        scanner.close();
    }
}
