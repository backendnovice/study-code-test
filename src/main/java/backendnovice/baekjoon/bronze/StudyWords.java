package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class StudyWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] alphabets = new int[26];
        char[] chars = scanner.next().toUpperCase().toCharArray();

        for(int i = 0; i < chars.length; i++) {
            int index = chars[i] - 65;
            alphabets[index]++;
        }

        char top = 'A';
        int count = 0;
        boolean dup = false;
        for(int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] > count) {
                dup = false;
                count = alphabets[i];
                top = (char) (i + 65);
                continue;
            }
            if(alphabets[i] == count) {
                dup = true;
                continue;
            }
        }

        System.out.print(dup ? "?" : top);
        scanner.close();
    }
}
