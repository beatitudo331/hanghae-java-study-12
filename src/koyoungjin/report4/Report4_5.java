package koyoungjin.report4;
// 문제 5-5
// 다음은 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
// 코드를 완성하세요. 다만 Math.random()을 사용했기 때문에 실행 결과 예시와 다를 수 있습니다.
public class Report4_5 {
    public static void main(String[] args) {
        int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] ball3 = new int[3];

        // 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int tmp = 0;

            //임시변수 tmp에 ballArr[i]번째 값 넣기
            tmp = ballArr[i];

            // ballArr[i]에 ballArr[j] 값 넣기
            ballArr[i] = ballArr[j];

            //아까 tmp에 넣었던거(ballArr[i]였던 값) ballArr[j]에 넣기
            ballArr[j] = tmp;

        }

        // 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
        // arraycopy 이용 (배열복사)
        // ballArr의 앞에서 3개 ball3로
        System.arraycopy(ballArr,0, ball3,0,3);

        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}
