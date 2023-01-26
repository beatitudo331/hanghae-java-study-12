package seoliha.report2;
// 3-2번 문제
public class Report2_2 {


    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //true. ||을 기준으로 좌우로 나눴을때 y >= 5가 참이므로 true가 반환됨.
        System.out.println(y += 10 - x++);
        // 13. y = 15가 되어 x++ 를 빼는데 참조될 x가 위에 없어서 그냥 x가 들어옴
        System.out.println(x += 2);
        // 5. 윗줄의 x++를 참조해서 오기 때문에 x=3인 상태로 들어옴
        System.out.println(!('A' <= c && c <= 'Z'));
        // false. 'A' <= c는 참. c <= 'Z'도 참('Z' 아스키코드 90)이므로
        System.out.println('C' - c);
        // 2. 둘다 char이므로 ASCII값으로 계산.  'C'는 67이므로.
        System.out.println('5' - '0');
        // 5. char이므로 ASCII 계산 시 '5'는 53, '0'은 48이므로 53-48.
        System.out.println(c + 1);
        // 66. '1'이 아니므로 'A'의 ASCII값 65에 실제 숫자를 더한 것.
        System.out.println(++c);
        // B. 65+1 = 66인데 char로 선언되었으므로 ASCII값 66인 B가 반환
        System.out.println(c++);
        // B. 위 값을 참조해오는건 맞으나 후위연산자이므로 먼저 print되어 ++ 수행이 반영되지 않음.
        System.out.println(c);
        // C. 위의 c++이 참조되어 66+1 =67(C의 ASCII값)이 되어 C 반환
    }
}
