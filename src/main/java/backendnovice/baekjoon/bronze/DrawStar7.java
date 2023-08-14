package backendnovice.baekjoon.bronze;

import java.util.Scanner;

public class DrawStar7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt() * 2 - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append("*");
        }

        String string = sb.toString();
        for(int i = 0; i < count; i++) {
            int firstIndex = string.indexOf("*");
            int finalIndex = string.lastIndexOf("*");
            if(firstIndex == finalIndex) {
                break;
            }else {
                string = string.substring(0, firstIndex) + " " + string.substring(firstIndex + 1);
                string = string.substring(0, finalIndex) + " " + string.substring(finalIndex + 1);
                sb.insert(0, string.stripTrailing() + "\n");
                sb.append("\n" + string.stripTrailing());
            }
        }

        System.out.print(sb);
        scanner.close();
    }
}
