package backendnovice.baekjoon.bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine().trim();
        StringTokenizer st = new StringTokenizer(string, " ");
        System.out.print(st.countTokens());

        scanner.close();
    }
}
