package jominsung.report2;
public class Report2_2 {
    public static void main(String[] args) {

        // 3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte) i;
        ch = (char) b;
        short s = (short) ch;
        float f = (float) l;
        i = (int) ch;
        // 정답 float f = (float)l; , i = (int)ch;
    }
}

        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        class Report3_2{
            public static void main(String[] args){
                int x = 2;
                int y = 5;
                char c = 'A'; // 'A'의 문자코드는 65

                //true 이며 x < 0 && x > 2 만 보면 and 코드 이기도 하지만 원래 틀렸는데 false가 나오겠지만 앞에 y >= 5 || 가 OR코드 이며 맞는거기에 true가 나옴
                System.out.println(y >= 5 || x < 0 && x > 2);
                //13 이며 y += 10 을 했을때 15가 되며 - x++ 은 ++이 더하기 1 과 같은데 x++ 이기때문에 x값을 먼저 가져와서 그냥 2이기 때문이다.
                System.out.println(y += 10 - x++);
                //5 이며 원래 같으면 2 + 2 같지만 위에 x++ 에서 후위 전산때문에 +1이 되서 3 + 2가 되서 5이다
                System.out.println(x += 2);
                //false 이며 원래는 둘다 맞는 공식이라 true 가 나와야 되는데 ! 가 not 코드라 flase가 된다.
                System.out.println(!('A' <= c && c <= 'Z'));
                //2 이며 'C'가 아스키코드로 67 이고 char c = 'A'라고 정의 했는데 'A'의 문자코드가 65 이기에 실질적으로 67 - 65 라서 이다.
                System.out.println('C' - c);
                //5 이며 문자열 - 문자열 이라 5가 나옵니다.
                System.out.println('5' - '0');
                //66이며  여기서 c가 'A' 인데 문자코드로 65에 +1을 해서 문자코드가 66이 되기 때문이다.
                System.out.println(c + 1);
                //B이며 전위 연산인데 ++가 +1 하는거와 같기때문에 c = "A' = 65에 +1을 하기때문이다.
                System.out.println(++c);
                //B가 나오며 원래 c++이 위에 있었으면 A가 나오겠지만 앞서 ++c를 먹고 내려와서 B가 나온다.
                System.out.println(c++);
                //C가 나오며 앞에 c++에서 c가 먹지가 않았는데 이 ++값이 뒤에 c값에 들어가서 +1되가지고 문자 코드가 67이 돼서 C가 된다.
                System.out.println(c);
            }
        }



//3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
        class Report3_3 {
            public static void main(String[] args){
                int num = 456;
                // 실수가 아닌 정수인 int를 써서 100을 나눠도 소숫점이 안나오기에 다시 100을 곱하면 400이 됨
                System.out.println(num/100*100);
            }
        }



//3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
        class Report3_4{
            public static void main(String[] args){
                int numOfApples = 123; // 사과의 개수
                int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
                int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket > 0 ? 1 : 0 ); // 모든 사과를 담는데 필요한 바구니의 수

                //한 바구니당 10개씩 담을수 있으니 여기서 사과의 개수 나누기 바구니의 크기 값을 하면 12가 되는데 여기서 +1을 해야되는 상황인데
                // 여기서 혹여나 값을 변형 했을때 그거에 맞게 바구니의 수도 늘려야 되기 때문에 조건문을 썻고 나머지가 줄어들수록 바구니의 갯수도 정확해해질수 있기에 나머지 구하는 연산을 썻다.

                System.out.println("필요한 바구니의 수 :"+numOfBucket);
            }
        }
//예상 결과 -> 필요한 바구니의 수 :13



//3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!
        class Report3_5{
            public static void main(String[] args){
                int num = 10;
                // 일단 두개는 어떻게 써야되는지 몰라서 구글링을 해서 확인 해서 이렇게 써봣는데 양수는 나오게 했는데 값이 달라졌을때 값을 바꾸는건 어떻게 해야될지 모르겟습니다.
                System.out.println(num >= 0 ?(num >= 0 ? "양수" : "0" ) : "음수");
            }
        }
//예상 결과 : 양수



//3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
        class Report3_6{
            public static void main(String[] args){
                int fahrenheit = 100;
                float a = (float)5/9*(fahrenheit - 32)* 1000;
                int b = (int)a;

                if (b%10 >= 5) {
                     b = b + 10 - 7;
                }
                double Celcius = b * 0.001;

                System.out.println("Fahrenheit:"+fahrenheit);
                System.out.println("Celcius:"+ Celcius );
            }
        }
//예상 결과 : Fahrenheit:100, Celcius:37.78

