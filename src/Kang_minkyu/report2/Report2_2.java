package Kang_minkyu.report2;

//3-2. 다음 연산의 결과와 그 이유를 적으세요.
public class Report2_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65


        System.out.println(y >= 5 || x < 0 && x > 2);
//      정답 : true / 해석 : 참과 거짓의 형태는, true || false && false 가 된다. 위의 설명에서 &&과 ||중 &&가 우선순위이기에 true값이 출력된다.
        System.out.println(y += 10 - x++);
//      정답 : 13 / 해석 : y += 10은 풀어쓰면, y라는 변수에 10을 더한것과 같다. 그리고 x++은 후위형 연산자 이기 떄문에 값이 참조 된 후 증가한다. 그러므로 5(y)+10 - 2 =13
        System.out.println(x += 2);
//      정답 : 5 / 해석 : 직전 식에서 x 값이 1증가하여서 5가됨
        System.out.println(!('A' <= c && c <= 'Z'));
//      정답 : false / 해석 : 아스키코드(A: 65, c:65, Z:90) 65 <= 65 && 65 <= 90  전부다 참이므로 !true = fals, false 값이 출력된다.
        System.out.println('C' - c);
//      정답 : 2 / 해석 : C의 아스키코드에서의 값은 67이다, 따라서 67 - 65는 2이다.
        System.out.println('5' - '0');
//      정답 : 5 / 해석 : 위와 마찬가지로 53 - 48을 하면 5이다.
        System.out.println(c + 1);
//      정답 : 66 / 해석 : c: 65, 65 + 1은 66이다.
        System.out.println(++c);
//      정답 : B / 'A' 의 문자 코드가 증가하여 66이되고, 그에 맞는 문자코드인 B가 출력된다.
        System.out.println(c++);
//      정답 : B / 위에서 1증가한 66 즉, B가 그대로 출력된다.
        System.out.println(c);
//      정답 : C / 해석 : 위에서 1 증가 후 끝났으므로 내려왔을때는 이미 C이다.

    }
}
