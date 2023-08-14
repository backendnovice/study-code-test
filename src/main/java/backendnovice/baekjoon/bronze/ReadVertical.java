package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class ReadVertical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[5];
        int maxLength = 0;
        for(int i = 0; i < 5; i++) {
            array[i] = scanner.next();
            if(array[i].length() > maxLength) {
                maxLength = array[i].length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < maxLength; i++) {
            for(int j = 0; j < 5; j++) {
                if(array[j].length() > i) {
                    sb.append(array[j].charAt(i));
                }
            }
        }

        System.out.print(sb);
        scanner.close();
    }
}
