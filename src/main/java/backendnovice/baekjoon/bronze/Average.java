package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // 스캐너를 생성하고 과목 수를 입력한다.
        Scanner scanner = new Scanner(System.in);
        final int COUNT = scanner.nextInt();

        // 1. 점수를 입력받고 최대값을 얻는다.
        double[] records = new double[COUNT];
        double high = 0;
        for(int i = 0; i < COUNT; i++) {
            records[i] = scanner.nextInt();
            if(records[i] > high) {
                high = records[i];
            }
        }

        // 2. 새로운 점수를 더하여 평균을 구한다.
        double average = 0;
        for(int i = 0; i < COUNT; i++) {
            average += records[i] / high * 100;
        }
        average /= COUNT;

        // 3. 평균을 출력하고 스캐너를 닫는다.
        System.out.print(average);
        scanner.close();
    }
}
