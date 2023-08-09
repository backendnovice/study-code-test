package backendnovice.baekjoon.bronze;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DIVISOR = 42, COUNT = 10;
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < 10; i++) {
            hashSet.add(scanner.nextInt() % DIVISOR);
        }

        scanner.close();

        System.out.print(hashSet.size());
    }
}
