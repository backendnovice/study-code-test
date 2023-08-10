package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class PrintExactly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
