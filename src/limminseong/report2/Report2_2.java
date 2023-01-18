package limminseong.report2;

// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        // 연산 순위가 높은 비교 연산자가 먼저 실행되고 이 후, 논리 연산자가 실행되므로,
        // 결과적으로 'true || false && true' 이며, 왼쪽에서 오른쪽으로 실행되는 논리 연산이기에,
        // 'true && ture' 가 되어, 결과 값은 true 가 된다.
        System.out.println(y >= 5 || x < 0 && x > 2);

        // 대인 연산 이전에 'x++' 의 연산 결과 값은 2 이고, (10 - 2) 울 수행하기에, 13 이 된다.
        System.out.println(y += 10 - x++);

        // 위에 식에서 3 으로 증가했기에, 답은 5 이다.
        System.out.println(x += 2);

        // '!' 이전의 연산 결과는 (true && true) 이고, !(ture) 이므로, 답은 false 이다.
        System.out.println(!('A' <= c && c <= 'Z'));

        // 'A' = 65, 'C' = 67 이기에, 67 - 65, 답은 2 가 나온다.
        System.out.println('C' - c);

        // '5' = 53, '0' = 48 이기에, 53 - 48, 답은 5 가 나온다.
        System.out.println('5' - '0');

        // 'A' = 65 이기에, 65 + 1, 답은 66 이 나온다.
        System.out.println(c + 1);

        // 'A' = 65 에 전위 증감 연산자를 통해 연산 결과가 66 이 된다. 고로 답은, 'B' 다.
        System.out.println(++c);

        // 'B' = 66 이고, 후위 증감 연산자이기에 연산 결과는 66이고, 답은 'B' 가 된다.
        System.out.println(c++);

        // 후외 연산으로 증가한 'C' 가 답이 된다.
        System.out.println(c);
    }
}
