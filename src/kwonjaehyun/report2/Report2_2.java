package kwonjaehyun.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //단순화하면 true OR false AND false 이기 때문에
        //true
        System.out.println(y += 10 - x++);
        //5 + 10 - 2(x++는 후위연산자 이기 때문에 2로 먼저 계산된 후 3이 된다)
        //13
        System.out.println(x += 2);
        //2+2로 원래 결과는 4여야 하지만 윗 라인에서 x에 후위연산자를 사용하였기 때문에 x=3이 되었다.
        //5
        System.out.println(!('A' <= c && c <= 'Z'));
        //NOT(true AND true)
        //'A'는 65로 c와 같기때문에 true 'Z'는 90 으로 c보다 크기 때문에 true 둘다 true이기때문에 true 이지만 NOT 가 있기 때문에 false 가 출력된다
        //false
        System.out.println('C' - c);
        //'C'의 아스키코드 67 - c(65)로 2가 된다
        //2
        System.out.println('5' - '0');
        //숫자 5-0이 아닌 48-53 이지만 그래도 값은 5이다
        //5
        System.out.println(c + 1);
        //c는 'A'지만 int +1을 계산하며 int형으로 자동형변환되어 출력된다.
        //66
        System.out.println(++c);
        //c는 아스키코드 65 지만 전위연산자로 인해 +1을 연산한 뒤에 참조되고 c의 값은 66이 되지만 연산만 된상태로 자료형은 바뀌지 않기 때문에 66의 아스키코드 'B'가 출력된다
        //B
        System.out.println(c++);
        //현재 C는 'B' 이므로 우선 'B'가 참조된 후 +1이 연산된다
        //B
        System.out.println(c);
        //윗 라인에서 +1이 연산되었기에 'C'로 출력된다
        //C
    }
}