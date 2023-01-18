package jeondabeen.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);       // true || false && false -> true || false -> true => ||보다 &&가 우선순위 높음
        System.out.println(y += 10 - x++);                  // y += 10 - 2 -> y = y + 8 -> y = 13 -> (x = 3)
        System.out.println(x += 2);                         // x = x + 2 -> x = 5
        System.out.println(!('A' <= c && c <= 'Z'));        // !(true && true) -> !true -> false
        System.out.println('C' - c);                        // 67 - 65 = 2
        System.out.println('5' - '0');                      // 5
        System.out.println(c + 1);                          // 65 + 1 = 66
        System.out.println(++c);                            // B => 증감연산자 반환 타입은 피연산자랑 같음
        System.out.println(c++);                            // B => 후위형 증감연산, 메서드 호출 후 증가
        System.out.println(c);                              // C
    }
}
