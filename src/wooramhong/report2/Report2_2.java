package wooramhong.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); //True y>=5가 성립하기 때문에
        System.out.println(y += 10 - x++); //13 x++은 뒤에 적용되기 때문에
        System.out.println(x += 2); //5 x = x+2와 같은 의미기 때문에
        System.out.println(!('A' <= c && c <= 'Z')); //false &&으로 두가지가 모두 성립하지 않으면 false
        System.out.println('C' - c); //2 C의 문자코드가 67
        System.out.println('5' - '0'); //5 int형으로 변환
        System.out.println(c + 1); //66 c='A'이고 A의 문자코드는 65 고로 65+1
        System.out.println(++c); //B c='A'이고 A의 문자코드는 65 거기에 +1을 해 66인 상태로 다시 char로 변환하면 B
        System.out.println(c++); //B 위에서 B가 되었고, 늦게 더해짐으로
        System.out.println(c); //C 위에서 늦게나마 +1이 되어서

    }
}

