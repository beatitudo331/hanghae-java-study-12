package Leesanghoon.report4;

import java.util.Random;
import java.util.Scanner;

public class Report4_6 {
    public static void main(String[] args) {
        String[] words = {"television", "computer", "mouse", "phone"};

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <words.length; i++) {
            char[] question = words[i].toCharArray();

            for(int j = 0; j < words[i].length(); j++) {
                int dummy = (int)(Math.random() * words[i].length());
                char temp = 0;
                temp = question[j];
                question[j] = question[dummy];
                question[dummy] = temp;
            }

            System.out.printf("Q%d. %s의 정답을 확인하세요.>", i + 1, new String(question));

            String answer = scanner.nextLine();

            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    }
}
