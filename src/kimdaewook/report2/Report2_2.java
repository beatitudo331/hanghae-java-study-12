package kimdaewook.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //true, &&이 ||보다 우선순위가 높기 때문에 x<0 && x>2가 false가 되고, y >= 5가 만족되어서 최종적으로 true || false = true가 됨.
        System.out.println(y += 10 - x++);
        //13, y에 +=10을 해서 y가 15가되고, 15에서 x를빼서 13이됨. 후위에 증감연산자를 썼기 때문에 출력이 된 뒤에 x가 3이됨.
        System.out.println(x += 2);
        //5, 11번 줄에서 x에 증감연산을 해서 x가 3이 됐기 때문에 5가됨.
        System.out.println(!('A' <= c && c <= 'Z'));
        //false, 문자 A가 c와 같고, c가 문자 Z보다 작기 때문에 괄호 안은 true가 되지만, 괄호 앞에 !가 붙었기 때문에 false가 됨.
        System.out.println('C' - c);
        //2, 문자C의 아스키코드는 67, 문자A의 아스키 코드는 65이기 때문에 2가 출력됨.
        System.out.println('5' - '0');
        //5, 문자5의 아스키코드는 53, 문자0의 아스키코드는 48이기 때문에 5가 출력됨.
        System.out.println(c + 1);
        //66, 문자A의 아스키코드에 1을 더하면 66이됨
        System.out.println(++c);
        //B, 전위에 증감연산자를 사용해서 B로 출력이 됨.
        System.out.println(c++);
        //B, 후위에 증감연사자를 사용해서 B로 출력이 됨. 후에 C가됨.
        System.out.println(c);
        //C, 윗줄에 c++이 됐기 때문에 C가 됨.

        //정답 : true, 13, 5, false, 2, 5, 66, B, B, C
    }
}
