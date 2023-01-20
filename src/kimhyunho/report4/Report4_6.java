package kimhyunho.report4;

//5-6. 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
//실행결과와 같이 동작하도록 빈 칸을 채우세요.
import java.util.Scanner;

class Report4_6 {
    public static void main(String args[]) {
        String[] words = { "television", "computer", "mouse", "phone" };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환
//--------------------------------------------------------------------------//
            // words.length -> question.length으로 " j " 의 반복문 작성
            // 랜덤함수 돌려야할 변수값 'idx' 생성
            // 값을 바꾸기 위한 tmp 생성

            for (int j = 0; j <question.length ; j++) {
                int  idx = (int)(Math.random()*question.length);
                char tmp;

                tmp = question[j];
                question[j]=question[idx];
                question[idx]=tmp;
            }
//--------------------------------------------------------------------------//
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
