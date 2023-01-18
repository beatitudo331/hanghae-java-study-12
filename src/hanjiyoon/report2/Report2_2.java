package hanjiyoon.report2;
// 3-2번 문제
// 다음 연산의 결과와 그 이유를 적으세요.
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //reulst: ture , why: &&가 ||보다 우선 연산이므로, (x<0 && x>2)는 false, (y>=5 || false) 는 true
        System.out.println(y += 10 - x++);
        //result: 13, why: y = y +(10-x++), 5+(10-2) = 8
        System.out.println(x += 2);
        //result: 5, why: x = x+2, x는 위의 x++에 의해 3이 되었으므로 3+2= 5
        System.out.println(!('A' <= c && c <= 'Z'));
        //result: false, why: false&&true => false
        System.out.println('C' - c);
        //result: 2, why: C의 아스키코드는 67, char c = 'A'이므로 65, 67-65 = 2
        System.out.println('5' - '0');
        //result: 5, why: '53-48 = 0
        System.out.println(c + 1);
        //result: 66, why: char c = 'A', 65+1 = 66
        System.out.println(++c);
        //result: B, why: 'A' + 1 =66
        System.out.println(c++);
        //result: B, why: 후위형 증가연산자이므로 현재 c는 B이고 해당 라인이 종료되면 그때 C가 됨
        System.out.println(c);
        //result: C, why: 위 라인이 끝난 후 ++이 실행되어 B에서 C가 되었음
    }
}