package kyungyeon.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);   // true. y >= 5 에서 이미 true
        System.out.println(y += 10 - x++);              // 13. 대입연산자가 가장 마지막. y+10-2 (x는 증가했지만 연산에 포함x)
        System.out.println(x += 2);                     // 5. 위에서 ++로 3되었는데 여기서 5가 됨.
        System.out.println(!('A' <= c && c <= 'Z'));    // false. 비교연산자 양쪽이 모두 true여서 !true의 형태가 되어, false
        System.out.println('C' - c);                    // 2. 아스키코드 상으로 2차이다.
        System.out.println('5' - '0');                  // 5. 같은 이유.
        System.out.println(c + 1);                      // 66. int형으로 형변환.
        System.out.println(++c);                        // B. 'A'에서 1증가하여 c는 'B'가 되었다.
        System.out.println(c++);                        // B. 실제 c는 'C'가 되었지만, 여기서는 원래 c인 'B'로 출력된다.
        System.out.println(c);                          // C.
    }
}
