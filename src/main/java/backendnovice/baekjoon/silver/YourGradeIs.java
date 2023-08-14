package backendnovice.baekjoon.silver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YourGradeIs {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>() {{
            put("A+", 4.5);
            put("A0", 4.0);
            put("B+", 3.5);
            put("B0", 3.0);
            put("C+", 2.5);
            put("C0", 2.0);
            put("D+", 1.5);
            put("D0", 1.0);
            put("F", 0.0);
        }};

        Scanner scanner = new Scanner(System.in);
        int count = 20;
        double total = 0, totalSum = 0;
        for(int i = 0; i < count; i++) {
            String name = scanner.next();
            double rate = scanner.nextDouble();
            String grade = scanner.next();

            if(grade.equals("P")) {
                count--;
                i--;
                continue;
            }else {
                total += rate * grades.get(grade);
                totalSum += rate;
            }
        }

        System.out.print(total / totalSum);
        scanner.close();
    }
}
