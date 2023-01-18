package choijenoghwan.report2;
// 3-2번 문제
class Exercise3_2 {
    public static void main(String[] args) {

//3-2번 문제 정답 :
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // 정답: true (true || false && false > true || false > true)
        System.out.println(y += 10 - x++); // 정답: 13 (y += 10 - 2 > y += 8 > y = y + 8)
        System.out.println(x += 2); // 정답: 5 (위 연산으로 인하여 x=3, x = x + 2)
        System.out.println(!('A' <= c && c <= 'Z')); // 정답: false (!(65 <= 65 && 65 <= 90) > !(true && true) > !true)
        System.out.println('C' - c); // 정답: 2 (67-65)
        System.out.println('5' - '0'); // 정답: 5 (53-48)
        System.out.println(c + 1); // 정답: 66 (65+1)
        System.out.println(++c); // 정답: 'B'
        System.out.println(c++); // 정답: 'B'
        System.out.println(c); // 정답:'C'
    }
}
