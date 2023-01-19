package kimwooyeong.report3;

import java.util.Arrays;
import java.util.Scanner;

public class report4_1 {
    //5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
    class Exercise5_3{
        public static void main(String[] args){
            int[] arr = {10, 20, 30, 40, 50};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("sum="+sum);
        }
    }//예상 결과 : sum=150



    //5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
    class Exercise5_4 {
        public static void main(String[] args) {
            int[][] arr = {
                    { 5, 5, 5, 5, 5 },
                    { 10, 10, 10, 10, 10 },
                    { 20, 20, 20, 20, 20 },
                    { 30, 30, 30, 30, 30 }
            };

            int total = 0;
            float average = 0;
            int a = 0;
            int b = 0;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    total += arr[i][j];
                }
                a = arr[i].length;
                b += a ;
            }
            average = (float)(total/b);
            System.out.println("total=" + total);
            System.out.println("average=" + average);
        } // end of main
    } // end of class



    //5-5. 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
//코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
    class Exercise5_5{
        public static void main(String[] args) {
            int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            int[] ball3 = new int[3];

            // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
            for (int i = 0; i < ballArr.length; i++) {
                int j = (int) (Math.random() * ballArr.length);
                int tmp = 0;
                tmp = ballArr[j];
                ballArr[j] = ballArr[0];
                ballArr[0] = tmp;
            }


            // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다

            ball3 = Arrays.copyOf(ballArr,3);

            for (int i = 0; i < ball3.length; i++) {
                System.out.print(ball3[i]);
            }
        }//end of main
    }//end of class



//5-6. 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다.
//실행결과와 같이 동작하도록 빈 칸을 채우세요.
import java.util.Scanner;

    class Exercise5_13 {
        public static void main(String args[]) {
            String[] words = { "television", "computer", "mouse", "phone" };

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < words.length; i++) {
                char[] question = words[i].toCharArray(); // String을 char[]로 변환
                int a = (int)(Math.random()*question.length);
                char tmp = question[a];
                question[a] = question[0];
                question[0] = tmp;
                System.out.println(Arrays.toString(question));





                System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(question));
                String answer = scanner.nextLine();
                System.out.println(answer);

                // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
                if (words[i].equals(answer.trim()))
                    System.out.printf("맞았습니다.%n%n");
                else
                    System.out.printf("틀렸습니다.%n%n");
            }
        } //end of main
    }//end of class
