package backendnovice.baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 알파벳 인덱스 배열을 생성하고 -1로 초기화.
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        // 2. 문자열을 입력받고 알파벳 인덱스를 갱신.
        String string = scanner.next();
        char[] characters = string.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            int index = characters[i] - 97;
            if(alphabets[index] == -1) {
                alphabets[index] = i;
            }
        }

        // 3. 알파벳 인덱스 배열을 출력.
        for(int alphabet : alphabets) {
            System.out.print(alphabet + " ");
        }

        scanner.close();
    }
}
