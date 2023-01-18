package kimwooyeong.report2;
// 3-2번 문제
public class Report2_2 {
    public static void main(String[] args) {
        //3-2. 다음 연산의 결과와 그 이유를 적으세요.
        class Exercise3_2{
            public static void main(String[] args){
                int x = 2;
                int y = 5;
                char c = 'A'; // 'A'의 문자코드는 65

                System.out.println(y >= 5 || x < 0 && x > 2);
                //1. y >= 5 || x < 0 값은 True , True && x > 2 값은 True 이기 떄문에 결과는 True
                System.out.println(y += 10 - x++);
                //2. y +=10 에서 y값은 15, x++ 의 x 값은 2로 연산후 ++ 해줘서 연산후 3 , 15-2는 13
                System.out.println(x += 2);
                //3. 2 에서 x의 결과는 3 , x +=2 로 5가 출력
                System.out.println(!('A' <= c && c <= 'Z'));
                //4. 'A' <= c && c <= 'Z' 값은 Ture지만 논리연산자 '!' 로 False값 출력
                System.out.println('C' - c);
                //5. 'C' - c는 아스키코드 10진법에 의해 67 - 65로 2 출력
                System.out.println('5' - '0');
                //6. 마찬가지로 아스키코드 변환후 5 출력
                System.out.println(c + 1);
                //7. c 는 아스키코드 65 이므로 + 1 을한 66 출력
                System.out.println(++c);
                //8. ++c는 아스키코드 65 + 1 이므로 66에  해당하는 'B' 출력
                System.out.println(c++);
                //9. c++은 연산 이후에 더해주는것이므로 그대로 'B' 출력
                System.out.println(c);
                //10. 9 에서의 결과로 c = 'C' 이므로 'C' 출력
            }
        }

        class Exercise3_3 {
            public static void main(String[] args){
                int num = 456;
                System.out.println(Math.floor(num/100)*100);
            }
        }
        //3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
        //만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
        //알맞은 코드를 넣으시오.
        class Exercise3_4{
            public static void main(String[] args){
                int numOfApples = 123; // 사과의 개수
                int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
                int numOfBucket = (int)Math.ceil((float) numOfApples/sizeOfBucket); // 모든 사과를 담는데 필요한 바구니의 수

                System.out.println("필요한 바구니의 수 :"+numOfBucket);
            }
        }
        //3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
        //삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
        //Hint : 삼항 연산자를 두 번 사용할 것!
        class Exercise3_5{
            public static void main(String[] args){
                int num = 10;
                System.out.println(num > 0 ? "양수":(num ==0 ? "0":"음수"));
            }
        }

        //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
        //변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
        // 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
        class Exercise3_6{
            public static void main(String[] args){
                int fahrenheit = 100;
                float celcius = (int)((5/9f*(fahrenheit-32)*100)+0.5)/100f;


                System.out.println("Fahrenheit:"+fahrenheit);
                System.out.println("Celcius:"+celcius);

            }
        }

    }
}
