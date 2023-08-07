package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class OvenClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();
        scanner.close();

        minute += time;

        if(minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }

        if(hour >= 24) {
            hour -= 24;
        }

        System.out.print(hour + " " + minute);
    }
}
