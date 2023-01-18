package koyoungjin.report2.koyoungjin.report2;
// 3-2번 문제
public class Report2_2 {

    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // 결과 : true
        /*
        5>=5 || 2<0 && 2>2
        true || false && false

        우선순위가 &&가 높으니 false && false 먼저 연산
        => true || false

        둘중에 하나라도 참일경우 참 반환
        => true
        */


        System.out.println(y += 10 - x++);
        // 결과 : 13
        /*
        왼쪽의 y(5)에 오른쪽의 10을 더한다. y=15
        x++는 후위형 증감연산자이기 때문에 15-2가 된 후 ++됨.
        15-2 = 13
        */


        System.out.println(x += 2);
        // 결과 : 4
        /*
        x=2
        왼쪽의 x(2)에 오른쪽의 2를 더한다. x=4
        */

        System.out.println(!('A' <= c && c <= 'Z'));
        // 결과 : true
        /*
        논리연산자보다 비교연산자 먼저 실행
        65 <= 65 && 65 <= 90
        true && true
        = true
         */


        System.out.println('C' - c);
        // 결과 : 2
        /*
        'C' = 67 , c = 65
        67-65 = 2
        */

        System.out.println('5' - '0');
        // 결과 : 5
        // 5-0

        System.out.println(c + 1);
        // 결과 : 66
        // 65+1

        System.out.println(++c);
        // 결과 : B
        /*
        ++c는 전위형 증감연산자이기 때문에
        c(65) 에서 1 증가해서 B(66)가 됨
        */


        System.out.println(c++);
        // 결과 : A
        /*
        c++은 후위형 증감연산자이기 때문에
        c(65) - 결과 A를 출력 후 증가함
        */

        System.out.println(c);
        // 결과 : A
        // c = 'A'를 그대로 출력
    }
}
