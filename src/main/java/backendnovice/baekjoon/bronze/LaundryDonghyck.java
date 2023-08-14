package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class LaundryDonghyck {
    public static void main(String[] args) {
        final int Quarter = 25;
        final int Dime = 10;
        final int NICKEL = 5;
        final int PENNY = 1;

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i = 0; i < count; i++) {
            int money = scanner.nextInt();
            int[] coins = new int[4];
            if(money >= Quarter) {
                coins[0] = money / Quarter;
                money %= Quarter;
            }
            if(money >= Dime) {
                coins[1] = (money / Dime);
                money %= Dime;
            }
            if(money >= NICKEL) {
                coins[2] = (money / NICKEL);
                money %= NICKEL;
            }
            if(money >= PENNY) {
                coins[3] = (money / PENNY);
                money %= PENNY;
            }
            for(int coin : coins) {
                System.out.print(coin + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
