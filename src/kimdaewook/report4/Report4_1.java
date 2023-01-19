package kimdaewook.report4;


import java.util.Arrays;
import java.util.Scanner;

// 5-1 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report4_1 {
    public static void main(String[] args) {
        //5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.
//        int[] arr[];
//        int[] arr = {1,2,3,};
//        int[] arr = new int[5];
//        int[] arr = new int[5]{1,2,3,4,5}; // 초기화와 동시에 선언했기 때문에 배열의 길이를 지정하면 안됨.
//        int arr[5];// 크기를 지정하는 위치가 잘못됨.
//        int[] arr[] = new int[3][];
        Report4_6 report = new Report4_6();
        report.report();
    }
}

// 5-2 번 문제   <- 이렇게 문제 번호 작성 필수
class Report4_2 {
    void report() {
        //5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은?
        int[][]arr ={
                {5,5,5,5,5},//index:0
                {10,10,10},//index:1
                {20,20,20,20},//index:2
                {30,30}//이부분
        };
        //정답 : 2
    }
}

// 5-3 번 문제   <- 이렇게 문제 번호 작성 필수
class Report4_3 {
    void report() {
        //5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        /*빈 칸*/
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }
}

// 5-4 번 문제   <- 이렇게 문제 번호 작성 필수
class Report4_4 {
    void report() {
        //5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
        int total = 0;
        float average = 0;
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        average = total / (float)(arr.length * arr[0].length);

        /*빈 칸*/

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}

// 5-5 번 문제   <- 이렇게 문제 번호 작성 필수
class Report4_5 {
    void report() {
        //5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
        //코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }

        for (int i = 0; i < 3; i++) {
            ball3[i] = ballArr[i];
        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        /*빈 칸*/
        ball3 = Arrays.copyOfRange(ballArr,0,3);
        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}

// 5-6 번 문제   <- 이렇게 문제 번호 작성 필수
class Report4_6 {
    void report() {
        //5-6. 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
        //실행결과와 같이 동작하도록 빈 칸을 채우세요.
        String[] words = { "television", "computer", "mouse", "phone", "elevator" };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            char[] question = words[i].toCharArray(); // String을 char[]로 변환

            int j = (int) (Math.random() * question.length);
            char tmp = 0;
            tmp = question[i];
            question[i] = question[j];
            question[j] = tmp;

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
