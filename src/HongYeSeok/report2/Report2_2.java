package HongYeSeok.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); //or연산자는 한 조건이 맞지 않더라도 둘 중 하나만 참이어도 true를 반환하기 때문에 ture가 출력됩니다.
        System.out.println(y += 10 - x++); // 변수 뒤 ++연산자는 모든 참조가 다 종료되고 난 후에 이루어지는 연산자이기 때문에 5 + 10 - 2가 일어난 이후 연산됩니다. 따라서 13이 출력됩니다.
        System.out.println(x += 2); // 앞서 ++ 연산이 이루어졌기 때문에 x가 3인 상태에서 2를 더했기 때문에 5가 출력됩니다.
        System.out.println(!('A' <= c && c <= 'Z')); // 이 식을 숫자로 바꿔 보면 (!(65 <= 65 && 65 <= 90)) 이고,  and 연산자는 두 조건이 모두 참이어야 true를 반환하는데
                                                     // 이 식은 둘 모두 만족하기에 우선 true를 반환하고, 부정 연산자!는 true와 false를 반전시키기 때문에 false가 출력됩니다.
        System.out.println('C' - c); // 이 식 역시 숫자로 바꾸면 67 - 65이기 때문에 2가 출력됩니다.
        System.out.println('5' - '0'); //이 식 역시 숫자로 바꾸면 53 - 48이기 때문에 5가 출력됩니다.
        System.out.println(c + 1); // 여기서 c는 변수 c이고, c에 저장된 정보는 문자 'A'이며, 문자 와 숫자의 연산에서 문자는 숫자로 취급되기 때문에 65 + 1이 되어 66이 출력됩니다.
        System.out.println(++c); // 변수 앞 ++연산자는 참조가 이루어지기 전에 실행되는 연산자이기 때문에 65+1로 B가 된 후 출력메서드가 참조하여 B가 됩니다.
        System.out.println(c++); //변수 뒤 ++연산자는 모든 참조가 다 종료되고 난 후에 이루어지는 연산자이기 때문에 출력메서드가 참조하여 B가 출력된 이후 c에 문자 C 저장됩니다.
        System.out.println(c); //c에는 현재 C가 저장되어 있기 때문에 C가 출력됩니다.
    }

}
