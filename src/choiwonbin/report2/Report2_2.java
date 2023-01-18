package choiwonbin.report2;
// 3-2번 문제
// 다음 연산의 결과와 그 이유를 적으세요.
public class Report2_2 {
    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.println(y += 10 - x++);
        System.out.println(x += 2);
        System.out.println(!('A' <= c && c <= 'Z'));
        System.out.println('C' - c);
        System.out.println('5' - '0');
        System.out.println(c + 1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);


    }
}


/*     정답

1. y >= 5 || x < 0 && x > 2


x < 0 && x > 2
x는 0보다  작거나 2보다 크면 true 값을 반환함
=> 조건이 일치하지 않으므로 false 값을 반환함

y >= 5 or false
y >= 5  : y는 5보다 크거나 같으면 true
=> y가 5보다 크거나 같으면 or false 중 하나만 일치하면 true를 반환함.

true || false && false

논리 연산자에서 &&은 ||보다 우선 순위가 높으므로

true || false            =>         true 값이 출력된다

2. y += 10 - x++

x++는 후위형이기 때문에 x값이 증가되지 않은 생태에서
계산되어 10-2 된 후 x에 값이 1 증가한다
5 + 8 이기때문에
13 이 출력된다

3. 앞에서 의 값이 1증가하여 3이 되었고,
x +=2 의 경우 x에 2를 더하고 x값에 다시 대입하기 대문에
3 + 2 가 되어 5가 x에 값에 대입되면서

5가 출력된다

4. c의 내용 문자 'A'가 조건에 부합하는지 아닌지를 확인 하는 조건식이다.
'A' <= c && c <= 'Z'        =>            'A' <= 'A' && 'A' <= 'Z' 가 되고
true && true 지만 놀리부정연산(!)을 수행하셔
true => false 로 바뀌게 되어

false 가 출력된다.


5. 문자 'C'와 char c 는 int 보다 작으므로
int 로 변환하여 연산을 수행한다.

C는 67, char c = 'A' 이므로 A는 65
67-65 = 2

2가 출력된다

6. 5번 문제와 마찬가지로 문자로 변환된 '5'와 '0'을 int로 변환하여
연산을 수행하는데

5 = 53, 0 = 48
53-48 = 5

5가 출력된다.

6. 5번 문제와 마찬가지로 문자 'A'에 int값 1을 추가한다.
'A' = 65 + 1

1이 출력된다.


7. char 'A'에 char 1 을 증가연산자를 구현 형식이며,
char c를 출력하기 전에
char C = 'A' + '1' 을 더하게 되므로 B로 변 한뒤 c에 값을 입력하여 char c = 'B' 를 대입한다.

변한 c를 pirnt 하므로

B를 출력한다.

8. 변수 char c를 호출하여 출력한 뒤, 증가 하기 때문에
호출 당시의 값은 B이므로

B를 출력한다.

9. 8번에서 후위 증가연산자의 영항으로 B 에서 C 로 증가하여

C를 출력한다.


 */
