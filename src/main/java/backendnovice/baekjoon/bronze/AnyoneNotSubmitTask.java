package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class AnyoneNotSubmitTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COUNT = 30, SUBMITS = 28;
        boolean[] students = new boolean[COUNT];

        for(int i = 0; i < SUBMITS; i++) {
            int idx = scanner.nextInt() - 1;
            students[idx] = true;
        }

        for(int i = 0; i < COUNT; i++) {
            if(students[i] == false) {
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}
