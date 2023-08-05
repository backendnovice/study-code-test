package backendnovice.baekjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SevenDwarfs {
    public static void main(String[] args) {
        final int COUNT = 9;
        final int SIZE = COUNT;
        final int GOOD = 100;
        List<Integer> heights = new ArrayList<>();

        // 1. 리스트에 난쟁이들의 키를 저장한다.
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < COUNT; i++) {
            heights.add(scanner.nextInt());
        }
        scanner.close();

        // 2. 키 리스트의 총합을 구한다.
        int total = 0;
        for(int height : heights) {
            total += height;
        }

        // 3. 키의 총합이 100이 될 때까지 계산하고 나머지를 삭제한다.
        for(int i = 0; i < SIZE - 1; i++) {
            for(int j = i + 1; j < SIZE; j++) {
                int check = total - (heights.get(i) + heights.get(j));
                if(check == 100) {
                    heights.remove(j);
                    heights.remove(i);
                    break;
                }
            }
            if(heights.size() != SIZE) {
                break;
            }
        }

        // 4. 키 리스트를 정렬하고 출력한다.
        Collections.sort(heights);
        for(int height : heights) {
            System.out.println(height);
        }
    }
}
