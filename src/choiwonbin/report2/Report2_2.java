package choiwonbin.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
    int x = 2;
    int y = 5;
    char c = 'A';   //  'A'의 문자코드는 65   (아스키코드)
        System.out.println(y >= 5 || x < 0 && x > 2); //true
//        y(5)는 5보다 크거나 같고 어느 하나가 true인 경우 true (x(2) < 0 작다 , x는 2보다 작다, && : 둘다 true인 경우 true)
        System.out.println(y += 10 - x++);
//        y+=10(5 + 10) - x(2+1) =13
        System.out.println(x += 2);
//        위에 x++ 계산으로 하면 x++(3) 3+2 = 5 위에 계산을 주석 처리하면 x(2)+2 = 4
        System.out.println(!('A' <= c && c <= 'Z'));
//        'A(65)'는 c('A') 작거나 같고 c('A')는 'Z' 보다 작거나 같다
        System.out.println('C' - c);
//        답 : 2 ,   'C'(67)-'A'(65)
        System.out.println('5' - '0');
//        답 : 5 ,   '5'(53) - '0'(48)
        System.out.println(c + 1);
//        답 : 66 , c('A')+1
        System.out.println(++c);
//        답 : B , 1+c('A')
        System.out.println(c++);
//        위에 코드를 합치면 답 : B, 아니면 A
        System.out.println(c);
//        답 : C , 코드가 위에서 한줄씩 내려오기 때문에 답은 'C' 포함을 안시킬 경우 'A'
    }
}
