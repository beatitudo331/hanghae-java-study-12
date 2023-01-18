package parkjaeyong.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65


        System.out.println(y >= 5 || x < 0 && x > 2); // true -> 연산자 우선순위에 의해 각 비교연산자들이 수행된 후 &&, ||가 있을 시 &&가 우선권을 갖는다
        System.out.println(y += 10 - x++); // y += 10을 통해 y가 15가되며 후위증감연산자 이기에 y - x = 13이 수행된 후 x가 하나 증가하여 x = 3이된다.
        System.out.println(x += 2); // x = x + 2 와 같이 x에 2를 더하고 다시 x에 대입되기에 5가 출력된다.
        System.out.println(!('A' <= c && c <= 'Z')); // 괄호 안에서 각각 비교연산자가 수행되어 true && true가 되면 비교연산에 의해 true가되고 최종적으로 !에 의해 false가 된다.
        System.out.println('C' - c); // 문자형의 경우 실제로 문자에 맞는 아스키코드 값이 수의 형태로 저장되 있으며 그렇기에 67-65인 2가 출력된다.
        System.out.println('5' - '0'); // 위와 동일하다.
        System.out.println(c + 1); //위와 같다.
        System.out.println(++c); // c 타입이 char이기에 값을 하나 먼저 올린 후 출력한다. 즉 값은 66이되지만 타입에 의해 66에 맞는 문자 'B'가 출력된다.
        System.out.println(c++); // 위와동일 하나 후위이기에 먼저 'B'가 출력된 후 값이 1 증가한다.
        System.out.println(c); // 위에서 설명한 부분에 연장으로 값이 1나 증가 되었기에 현재 c는 'C'가 된다.
    }
}
