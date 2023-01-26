package parkjaeyong.report4;

import java.util.Scanner;

// 5-6번 문제
public class Report4_6 {
    public static void main(String[] args) {
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            for(int j = 0 ; j < question.length ; j++){
                int rNum = (int)(Math.random()* question.length);
                char tmp = question[0];
                question[0] = question[rNum];
                question[rNum] = tmp;
            }

            System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(question));
            String answer = scanner.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    }
}
