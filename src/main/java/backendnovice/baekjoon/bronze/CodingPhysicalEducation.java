package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class CodingPhysicalEducation {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int bytes = scanner.nextInt();
        scanner.close();

        for(int i = 0; i < bytes; i += 4) {
            result.append("long ");
        }
        result.append("int");

        System.out.print(result);
    }
}
