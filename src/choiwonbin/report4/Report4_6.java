package choiwonbin.report4;
import java.util.Scanner;

public class Report4_6 {

    public static void main(String args[]) {

        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++) {
            char[] question = words[i].toCharArray(); // String char[] 을 로 변환
            for(int j=0;j<question.length;j++) {
                int idx = (int)(Math.random() * question.length);
                char tmp = question[i];
                question[i] = question[idx];
                question[idx] = tmp;
            }
            System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(question));

            String answer = scanner.nextLine();

            // trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
            if(words[i].equals(answer.trim())) {
                System.out.printf(" .%n%n");
            }
            else {
                System.out.printf(" .%n%n");
            }
        }
    } // main의 끝
}
