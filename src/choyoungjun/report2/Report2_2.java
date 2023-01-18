package choyoungjun.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // true or (false and false) = true or false = true
        System.out.println(y += 10 - x++);
        // y += 10 => 15, y-x = 13 , x++ => x의 값을 3으로 변화시킨다.(print에 반영안됨)
        System.out.println(x += 2);
        // x += 2 => x에다가 2를 더해준다 => 3+2 = 5
        System.out.println(!('A' <= c && c <= 'Z'));
        // !(true and true) = false
        System.out.println('C' - c);
        // C의 아스키코드는 67, 67-65 = 2
        System.out.println('5' - '0');
        // 5
        System.out.println(c + 1);
        // char + int = int => 66
        System.out.println(++c);
        // c의 ASKII코드를 66으로 변화시킨다. 따라서 B됨
        System.out.println(c++);
        // print해서 B를 찍고 char c = 'C'형태로 변화시킨다.
        System.out.println(c);
        // char c = 'C' 출력된다.
    }
}
