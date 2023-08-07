package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        if(minute < 45) {
            hour = (hour == 0) ? 23 : --hour;
            minute = 60 + (minute - 45);
        }else {
            minute -= 45;
        }

        System.out.print(hour + " " + minute);
    }
}
