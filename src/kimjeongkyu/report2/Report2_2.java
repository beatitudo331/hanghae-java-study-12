package kimjeongkyu.report2;
//3-2. 다음 연산의 결과와 그 이유를 적으세요.


public class Report2_2{
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // y는 5이상이기 때문에 왼쪽은 true, x는 0보다 크기 때문에 false, x는 2와 같기 때문에 false
        // && 연산이 || 연산보다 우선순위가 높기 때문에 x < 0 && x > 2 부분은 false
        // 이후 y >= 5 ||  false 연산이 이루어지며 true 결과 출력
        System.out.println(y += 10 - x++);
        // x는 지금 2이다. 이 연산이 실행되면 2를 적용시키고 이후 3이 된다.
        // 10 - 2 즉 8을 y에 더한다. 13출력
        System.out.println(x += 2);
        // 이전 연산에서 x는 3이 되었기 떄문에 2를 더하면 5가 된다.
        System.out.println(!('A' <= c && c <= 'Z'));
//        c는 65이다. 'A'도 65이다. 따라서 'A' <= c  는 true
//        c 는 65, 'Z' 는 90이다. 따라서 c <= 'Z' 는 true
//        'A' <= c && c <= 'Z' 는 true && true 이므로 true
//        마지막으로 !(true) 이기때문에 false 출력
        System.out.println('C' - c);
//        'C'는 'A' 보다 2 크다 'A' = 65, 'B' = 66, 'C' = 67
//        따라서 67 - 65 = 2
        System.out.println('5' - '0');
//        원래 문자열 연산은 +만 가능하지만 숫자가 문자열이라면 ("5")
//        연산이 가능하도록 형변환하여서 연산이 진행된다.
//        5 - 0 = 5
        System.out.println(c + 1);
//        c는 char 타입이지만 연산이 가능하다. 'A' = 65
//        따라서 65 + 1 = 66
        System.out.println(++c);
//        증감 연산자가 독립적으로 사용된 경우, 전위형과 후위형의 차이는 없다.
//        65 + 1 = 66 -> 'B'
        System.out.println(c++);
//        증감 연산자가 독립적으로 사용된 경우, 전위형과 후위형의 차이는 없다.
//        65 + 1 = 66 -> 'B'
        System.out.println(c);
//        이전 연산에서 증감 연산자를 2번 사용했으므로 65 -> 66 -> 67
//        67 -> 'C' 이다.
    }
}