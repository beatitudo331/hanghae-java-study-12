package LISHANYU.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        //true  이유: && 먼저 실행 후 || 실행하기때문에 true || false && false => true
        System.out.println(y += 10 - x++);
        //13 이유: y = y + (10 - (x+1)) = 5+(10-(2+1))=13
        System.out.println(x += 2);
        //5 이유: x=x+2 단, 위에서 x=3으로 출력되어 x=3으로 입력한다.=> x=3+2=5
        System.out.println(!('A' <= c && c <= 'Z'));
        //false 이유: !(65<=65 && 65 <= 90) => !(true) => false
        System.out.println('C' - c);
        //2 이유: 67-65=2
        System.out.println('5' - '0');
        //5 이유: 53-48=5
        System.out.println(c + 1);
        //66 이유: 65+1=66
        System.out.println(++c);
        //B 이유: 값이 참조되기 전에 증가시킨다 ++'A' = 65+1=66  => B
        System.out.println(c++);
        //B 값이 참조된 후에 증가시킨다. => 65+1=66
        System.out.println(c);
        //C


    }
}
