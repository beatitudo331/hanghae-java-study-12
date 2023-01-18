package Kimjonwon.report2;
// 3-2번 문제
class Report2_2{
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);  //  논리 연산자 || 기준으로 왼쪽 참 오른쪽 거짓으로 참 반환
        System.out.println(y += 10 - x++);  // 전위식으로 인해 계산이 다 끝난 후에 x가 증가
        System.out.println(x += 2);  // 증가한 x=3에 2를 더함
        System.out.println(!('A' <= c && c <= 'Z'));  // 안쪽의 두 값 참에 반전 !을 하여 거짓
        System.out.println('C' - c);   // 67-65 = 2
        System.out.println('5' - '0');  //  53 - 48 = 5
        System.out.println(c + 1);  // 65 + 1
        System.out.println(++c); // 먼저 증가하므로 66 = B
        System.out.println(c++); // 후에 증가하므로 동일
        System.out.println(c);  // 증가하여 67 = C
    }
}