package HongYeSeok.report2;

public class Report2_2 {

}

//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
class Exercise3_1 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte) i;
        ch = (char) b;
        short s = (short) ch;
        float f = (float) l;
        i = (int) ch;
        // 정답 : 4번 5번
    }
}

//3-2. 다음 연산의 결과와 그 이유를 적으세요.
class Exercise3_2 {
    public static void main(String[] args) {
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

//3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
class Exercise3_3 {
    public static void main(String[] args) {
        int num = 111;
        System.out.println(num - num % 100);
    }
}

//3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
class Exercise3_4 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = (int)Math.ceil((double) numOfApples / sizeOfBucket); // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 :" + numOfBucket);
    }
}
//예상 결과 -> 필요한 바구니의 수 :13


//3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!

class Exercise3_5 {
    public static void main(String[] args) {
        int num = 10;
        String positiveZeroNegative = num > 0  ? "양수" : num < 0 ? "음수" : "0";
        System.out.println(positiveZeroNegative);
    }
}
//예상 결과 : 양수


//3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
class Exercise3_6{
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = (float) 5/9*((fahrenheit-32));

        System.out.printf("Fahrenheit: %d,", fahrenheit);
        System.out.printf(" Celcius: %.2f", celcius);
    }
}
//예상 결과 : Fahrenheit:100, Celcius:37.78






