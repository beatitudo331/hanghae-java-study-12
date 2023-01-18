package josungjae.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
//      true : y가 5보다는 큰것은 참인데, x는 0보다 크므로 거짓 " || " 연산자는 하나만 참이면 참이 나오므로 true
        System.out.println(y += 10 - x++);
//        13 : y는 5에 += 에 따라 5+10을 하여 15를 한 뒤 -x (=2)에 따라 13이 된다.
        System.out.println(x += 2);
//        3 : 이전 식에서 x++에 의해 1이 증가되었고, 거기에 2를 더하여 답이 3이 되었다.
        System.out.println(!('A' <= c && c <= 'Z'));
//        false : 'A' <=c = true 이고 c<='Z' = false 이므로 false
        System.out.println('C' - c);
//        2 : 65 - 63 = 2
        System.out.println('5' - '0');
//        5 : 5-0 = 5
        System.out.println(c + 1);
//        66 = 65+1 = 66
        System.out.println(++c);
//        B = 증감연산자 독립 사용으로 값 변환 없음
        System.out.println(c++);
//        B = 증감연산자 독립 사용으로 값 변환 없음
        System.out.println(c);
//        c = 이전 과정에 의해 67이되어 '67' = 대문자 C
    }
}
