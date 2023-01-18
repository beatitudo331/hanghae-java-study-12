package kimyeowon.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x=2, y=5;
        char c = 'A';

        System.out.println(1+x << 33); // 6
        System.out.println(y >= 5 || x<0 && x>2); //true
        System.out.println(y += 10 - x++); // 13
        System.out.println(x += 2); //5
        System.out.println(!('A'<=c && c <= 'Z')); // false
        System.out.println('C'-c);  // 2
        System.out.println('5'-'0');  // 5
        System.out.println(c+1); // 66
        System.out.println(++c); // B
        System.out.println(c++);  // B
        System.out.println(c);  // C
    }
}
