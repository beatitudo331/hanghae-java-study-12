package kimdongmin.report4;
import java.util.Scanner;

public class Report4_6 {
}
//5-6 문제
class Exercise5_13 {
    public static void main(String args[]) {
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            /*빈 칸*/
            for (int j = 0; j < question.length; j++) {
                int num = (int)(Math.random()* question.length);
                char tmp = question[0];
                question[0] = question[num];
                question[num] = tmp;
            }
            //빈칸 끝

            System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(question));
            String answer = scanner.nextLine();

            // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다.%n%n");
            else
                System.out.printf("틀렸습니다.%n%n");
        }
    } //end of main
}//end of class