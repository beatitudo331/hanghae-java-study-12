package parkseongmin.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); //    true    //  y >= 5 true, x < 0 False, x >2 False 이므로0 true, False 중 하나가 참이므로
        System.out.println(y += 10 - x++);            //    13      //  y = 5+10로 y = 15이고 x는 2이므로 15-2이다. ++ 후위 증가 연산자로 x의 값은 이후 3이고 y값은 13이다.
        System.out.println(x += 2);                   //    5       //  x는 현재 3이고 +2를 더 한 값을 대입하면 5이다.
        System.out.println(!('A' <= c && c <= 'Z'));  //    False   //  'A'와 'Z'는 문자열이므로 오류
        System.out.println('C' - c);                  //    2       //  'A'는 65, 'C'는 67이므로 2
        System.out.println('5' - '0');                //    5       //  모두 문자열이므로 값을 변환해준다. '5'는 53 '0'은 48이므로
        System.out.println(c + 1);                    //    66      //  숫자 1과 결합하기 위해 자동으로 int(A) 적용되어 'A'는 65, 65 + 1 = 66
        System.out.println(++c);                      //    B       //  'A'는 65, 1을 먼저 증가 = 66 는 문자열 B
        System.out.println(c++);                      //    B       //  현재 c의 값은 문자열 B를 출력하고 이후 c의 값은 문자열 C가 된다.
        System.out.println(c);                        //    C       //  현재 문자열 값인 C를 출력
    }
}
