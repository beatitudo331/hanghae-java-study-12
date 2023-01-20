package kimhyunho.report2;

public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // 정답 : false // x값 미충족
        System.out.println(y += 10 - x++);
        // 정답 : 15 - 2 = 13
        System.out.println(x += 2);
        // 정답 : 4
        System.out.println(!('A' <= c && c <= 'Z'));
        // 정답 : true // 값은 false 이지만 ! 으로 true
        System.out.println('C' - c);
        // 정답 : 2
        System.out.println('5' - '0');
        // 정답 : 5
        System.out.println(c + 1);
        // 정답 : 66
        System.out.println(++c);
        // 정답 : B
        System.out.println(c++);
        // 정답 : A
        System.out.println(c);
        // 정답 : 'A'
    }
}