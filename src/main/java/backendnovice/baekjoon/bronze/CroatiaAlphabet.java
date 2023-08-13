package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class CroatiaAlphabet {
    public static void main(String[] args) {
        final String[] TEMPLATE = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.next();
        for(String template : TEMPLATE) {
            sentence = sentence.replace(template, ".");
        }

        System.out.print(sentence.length());
        scanner.close();
    }
}
