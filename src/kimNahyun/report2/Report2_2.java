package kimNahyun.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';  // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x<0 && x>2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A'<=c && c<= 'Z'));  //z의 분자코드 90
        System.out.println('C' - c);    // c의 문자코드 99
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        // 각각 예상 값 : false, 13, 4, true, 34, 모름, A1, B, A, A
        // 2번 8번 빼고 다틀림...
        // 정답 : true, 13,5,false, 2,5,66,B,B,C
    }
}
