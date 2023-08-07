package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if(a > b) {
            System.out.print(">");
        }else if(a < b) {
            System.out.print("<");
        }else {
            System.out.print("==");
        }
    }
}
