package backendnovice.baekjoon.silver;

import java.util.Scanner;

public class GroupWordChecker {
    public static void main(String[] args) {
        // 1. 단어를 개수만큼 입력.
        Scanner scanner = new Scanner(System.in);
        int count = 20;
        String[] words = new String[count];
        for(int i = 0; i < count; i++) {
            words[i] = scanner.next();
        }

        // 2. 그룹단어 여부를 판단하고, 개수를 저장.
        int groupCount = 0;
        for(String word : words) {
            String[] alphabets = word.split("");
            StringBuilder memory = new StringBuilder();
            boolean isGroup = true;
            String previous = "";
            for (String alphabet : alphabets) {
                String _memory = memory.toString();
                // 메모리에 해당문자가 존재하며, 이전문자가 현재문자와 같지 않을 경우, 그룹단어가 아니라 판단.
                if (_memory.contains(alphabet) && !(previous.equals(alphabet) || previous.length() == 0)) {
                    isGroup = false;
                    break;
                } else {
                    memory.append(alphabet);
                    previous = alphabet;
                }
            }
            if(isGroup) {
                groupCount++;
            }
        }

        // 3. 그룹단어의 개수를 출력.
        System.out.print(groupCount);
        scanner.close();
    }
}
