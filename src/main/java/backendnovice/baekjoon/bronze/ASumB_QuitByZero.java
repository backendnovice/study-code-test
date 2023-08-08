package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ASumB_QuitByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a == 0 && b == 0) {
                break;
            }else {
                System.out.println(a + b);
            }
        }

        scanner.close();
    }
}
