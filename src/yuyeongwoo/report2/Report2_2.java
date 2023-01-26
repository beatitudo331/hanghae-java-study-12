package yuyeongwoo.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //결과: true, 이유: true || false && false 가 되고, && 연산자의 우선순위가 더 높기 때문에 true || false 가 된다. 따라서 true가 나온다.
        System.out.println(y += 10 - x++);
        //결과: 13, 이유: 위 식을 풀어쓰게 되면, y = y + 10 - x++ 가 된다. x는 후위형이기 때문에 값이 증가하지 않은 상태에서 식이 계산된다. 따라서 y = 5 + 10 - 2 -> y = 13
        System.out.println(x += 2);
        //결과: 5, 이유: 이전 식에서 x의 값이 1증가했기 때문에 x = 3 + 2가 되어 x는 5가 된다.
        System.out.println(!('A' <= c && c <= 'Z'));
        //결과: false, 이유: c는 A와 Z사이에 존재하는 대문자이기 때문에 참이 된다. 하지만 논리부전연산자에 의해 false가 된다.
        System.out.println('C' - c);
        //결과: 2, 이유: 'C' 와 'A'는 정수로 변환되어 각 67, 65가 되고 따라서 67 - 65 = 2가 된다.
        System.out.println('5' - '0');
        //결과: 5, 이유: 위와 같은 이유로 53 - 48이 되어 5가 답이다.
        System.out.println(c + 1);
        //결과: 66, 'A'가 정수 65로 변환되고 65 + 1 = 66이 된다.
        System.out.println(++c);
        //결과: B, 이유: 'A'의 문자코드 값이 1증가되고, 66이 된다. 문자코드 66에 해당하는 문자 B를 출력한다.
        System.out.println(c++);
        //결과: B, 이유: 후위형이기 때문에 위에서 증가된 값 B가 출력되고 1증가한다.
        System.out.println(c);
        //결과: C, 이유: 위에서 1증가했기 때문에 문자코드 67에 해당하는 C가 출력된다.
    }
}
