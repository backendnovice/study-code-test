package backendnovice.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // 1. 숫자들을 입력받는다.
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        String numB = scanner.next();
        scanner.close();

        // 2. 숫자 B의 자릿수를 저장한 배열을 생성한다.
        int[] digits = Arrays.stream(numB.split("")).mapToInt(Integer::parseInt).toArray();

        // 2. 자릿수 별로 곱하고 결과를 출력한다.
        int tot = 0;
        for(int i = 0; i < 3; i++) {
            int res = numA * digits[2 - i];
            tot += (i == 0) ? res : res * (Math.pow(10, i));
            System.out.println(res);
        }
        System.out.print(tot);
    }
}
