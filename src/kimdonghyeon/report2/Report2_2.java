package kimdonghyeon.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); //true || false && false or보다 and의 우선순위가 더 높기 때문에 true가 나옴
        System.out.println(y += 10 - x++); //후위 연산자는 코드를 일단 실행하고 난 뒤에 적용되기 때문에 5+10-2가 맞음
        System.out.println(x += 2); //위쪽 후위 연산자에 위해 3이되고 +2가 실행되어 5가나옴
        System.out.println(!('A' <= c && c <= 'Z')); // true && true는 true고 느낌표가 붙어 not이 되어 false가 됨
        System.out.println('C' - c); //'C'는 문자코드로 67이므로 67-65가 됨
        System.out.println('5' - '0'); //85 - 80 문자코드도 80부터 0~9까지 순서대로 있기때문에 5가 나옴
        System.out.println(c + 1); //A의 문자코드는 65이기때문에 +1 하면 66
        System.out.println(++c);//전위 연산자는 코드가 실행되기전에 적용되어 문자코드 66인 B로 나오게됨
        System.out.println(c++);//후위 연산자이므로 코드가 실행된후 다음코드부터 적용
        System.out.println(c); //위에 후위연산자때문에 C가나옴
    }
}
