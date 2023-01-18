package hwj_report;

public class Report02 {

    public static void main(String[] args) {

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        //3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        float f = l; // 정답
        i = (int)ch; // 정답

        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // true   이유 : 먼저 해석하면 5>=5 OR 2 < 0 AND 2 > 2   => 먼저 한 조건이라도 true이기 때문에 true
        System.out.println(y += 10 - x++);
        // 13   이유 : 15 - 2
        System.out.println(x += 2);
        // 5   이유 : 변수 x에 2를 더하자 2+2 = 4 인줄 알았으나 앞 식에서 증가연산자 때문에 x가 1 증가 함 그래서 3+2+=5가 나옴
        System.out.println(!('A' <= c && c <= 'Z'));
        // false   이유 : 먼저 괄호안의 식이 먼저 계산되고 마지막에 !에의해 반대로 바뀐다. 두식다 true 이지만, !true = false
        System.out.println('C' - c);
        // 2   이유 : 피연산자가 int보다 작은 타입(byte, short, char)인 경우 int로 변환한 다음에 연산을 수행한다. c의 값이 'A'이므로 'C'-c는 ‘C'-'A'가 되고 'C'와 'A'는 int로 변환되어 '67 - 65'가 되고 최종결과는 2가 된다. 구글링에서 결과를 찾아봄
        System.out.println('5' - '0');
        // 5   이유 : 위와 마찬가지로 '5'라는 문자코드가 나타내는 숫자 53, '0'을 문자코드가 나타내는 숫자 48 둘을 빼서
        System.out.println(c + 1);
        // 66   이유 : A는 문자코드 값이 65라는 결과로 얻게 되므로 연산 되어 66이라는 값이 나온다.
        System.out.println(++c);
        // B   이유 : 증감 연산자는 형변환이 발생하지 않기에
        System.out.println(c++);
        // B   이유 : 증감 연산자는 형변환이 발생하지 않기에
        System.out.println(c);
        // C   이유 : B에서 증가해버림


        //3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
        //만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
        //알맞은 코드를 넣으시오.
        int num = 456;

        num = num - (num % 100);

        System.out.println(num);


        //3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
        //만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
        //알맞은 코드를 넣으시오.

        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = Math.round((int)(numOfApples / sizeOfBucket) + 0.5f); // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 : " + numOfBucket);


        //3-5. 아래는 변수 num2의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
        //삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
        //Hint : 삼항 연산자를 두 번 사용할 것!
        int num2 = 10;
        System.out.println((num2 > 0) ? "양수" : (num2 < 0) ? "음수" : "0");


        //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
        //변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
        // 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
        int fahrenheit = 100;
        float celcius = (int)(5/9f * (fahrenheit-32) * 100 + 0.5) / 100f; // 화씨 계산 할때 소수자리가 나오게 (int)와 f를

        System.out.println("Fahrenheit: "+fahrenheit);
        System.out.println("Celcius: "+celcius);


    }


}
