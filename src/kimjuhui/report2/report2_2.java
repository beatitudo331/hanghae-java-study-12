package kimjuhui.report2;

public class report2_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); //정답 : true,
        //이유:  y >= 5 || x < 0 && x > 2 -> true || (false && true) -> true || false -> true (&&이 ||보다 연산자 우선순위가 높다.)
        System.out.println(y += 10 - x++); //정답 : 13
        //이유: 15 - 2 = 13 (후위증감연산자이기 때문에 x는 2인 상태로 연산이 진행되고 연산이 진행된 후에야 x값은 3으로 증가한다. )
        System.out.println(x += 2); //정답 : 5
        //위 연산에서 x는 후위증감으로 3으로 증가한 상태이다. 3+2 = 5
        System.out.println(!('A' <= c && c <= 'Z')); //정답 : false
        //이유: !(true && true) -> !(true) -> false ('A'는 c의 값인 'A'와 같은 값이라서 true, 'A' 는 'Z' 보다 작은 값이므로 true, 이 둘은 && 연산으로 true이지만 ! (not) 연산으로 인해 true의 반댓값인 false가 나온다.)
        System.out.println('C' - c); //정답: 2
        //이유: 67 - 65 = 2 (아스키코드 값으로 계산)
        System.out.println('5' - '0'); // 정답: 5
        //이유: 53 - 48 = 5 (아스키코드 값으로 계산)
        System.out.println(c + 1); // 정답: 66
        // 이유: 'A' + 1 -> 65 + 1 -> 66 ('A'의 아스키코드 값은 65이다. 65 + 1은 66.)
        System.out.println(++c); //정답: B
        // 이유: 문자 A를 증감시키면 다음 문자인 B가 된다.
        System.out.println(c++); //정답: B
        // 이유: 후위증감연산자이기 때문에 바로 위에서 증감된 B가 그대로 출력되며, 출력한 뒤 B는 C로 증감된다.
        System.out.println(c); //정답: C
        // 이유: 위에서 후위증감연산자로 B가 출력후에 바로 C로 증감되었기 때문에 c의 값은 C이다.
    }
}
