package parkhyunah.report2;
// 3-2번 문제
public class Exercise3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        /*
        true 	y는 5보다 같거나 큰 수 또는 x는 0보다 작고 2보다 크다 // x는 2이기 때문에 진실, y도 5이기 때문에 진실!
        13	y=5, x=2 // y +=(덧셈) 10 , x++; 2+1 // [(5 + 10) - (2 + 1) = 12]
        5 전체로 계산했을때, 위에서 증강했기 때문에 3+2	     다 주석 처리 할때 4  x=2, x +=2;  2+2 =4
        false	(!('A' <= c && c <= 'Z')) 참과 거짓 찾기 'A' <=c 그리고 c<= 'Z' //'A'는 char c라고 이미 선언했고, 아스키코드 65 때문에 참 그리고 'Z'는 아스키코드로 'Z'는 c보다 크기 때문에 참. &&때문에 모두 참이여야 참을 반환하지만  '!' 때문에 거짓으로 표시
        2	C 아스키코드 = 67 - 65 = 2
        5	'5' - '0' 뺄셈 연산처럼 보이나 사실은 각각의 문자로 출력되었다. //의문점 보통 문자로 출력이 되었다면, null로 표시되지 않나? 확인 필요
        66	c=A,   A 아스키코드 = 65 +1 = 66
        B	c=A,   A 아스키코드 = 65// ++c; 는 증강이기때문에 66이며 66은 아스키코드로 B에 해당
        B	c=A,   A 아스키코드 = 65// c++; 는 증강이기때문에 66이며 66은 아스키코드로 B에 해당
        C
        */
    }
}
