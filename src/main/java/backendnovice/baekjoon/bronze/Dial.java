package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class Dial {
    private enum Dials {
        A(2), B(2), C(2),
        D(3), E(3), F(3),
        G(4), H(4), I(4),
        J(5), K(5), L(5),
        M(6), N(6), O(6),
        P(7), Q(7), R(7), S(7),
        T(8), U(8), V(8),
        W(9), X(9), Y(9), Z(9);

        final int value;

        Dials(int value) {
            this.value = value;
        }

        int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.next().split("");
        int total = 0;
        for(String string : strings) {
            int number = Dials.valueOf(string).value;
            total += ++number;
        }
        System.out.print(total);

        scanner.close();
    }
}
