package kimgwanhee.report2;

public class Report2_2 {
    // 3-1번 문제
    byte b = 10;
    char ch = 'A';
    int i = 100;
    long l = 1000L;

//    b = (byte)i;
//    byte형(1byte)이 100(int라서 4byte)을 담을 수 없음. 따라서 캐스팅 필수.
//    ch = (char)b;
//    byte형(1byte)를 char형(2byte)에 담는 것이라 크기는 되지만 범위가 다르기 때문에 캐스팅 필수.
//    short s = (short)ch;
//    short크기는 되지만 메모리 참조하는 범위가 다름. 따라서 생략하면 안됨.
//    float f = (float)l;
//    생략가능
//    i = (int)ch;
//    생략가능
//    4,5

    // 3-2번 문제
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
//        true y는 5보다 같거나 커야하는데 같고, 논리연산자 &&가 ||보다 먼저 계산됨 &&는 둘다 성립해야하는데 둘다 틀린상황, 하지만 ||는 둘 중 하나만 성립해도 true를 출력
        System.out.println(y += 10 - x++);
//        += 보다 -를 먼저 계산함. ++가 후위형으로 작동하므로 10에 x의 기존값 2를 뺀 8을 y에 더한 값은 5 + 8 즉, 13출력. 이후 x는 기존의 2가 아닌 3이 된다
        System.out.println(x += 2);
//        이전에 x에 1을 더한 상태였기 때문에 3 + 2 즉, 5가 출력
        System.out.println(!('A' <= c && c <= 'Z'));
//        &&는 and로 둘 다 성립해야 true 반환,,, 이지만 여기서 앞에 !가 있으므로 반대로 출력해서 false
        System.out.println('C' - c);
//        A 는 문자코드 65, 대문자 C는 거기서 2를 더한 67을 문자코드로 가지므로 출력값은 2
        System.out.println('5' - '0');
//        숫자 0에서 9까지의 아스키 코드 값은 48~57인데, 이를 떠나 오름차순으로 정렬된다는 것만 안다면 어차피 차이는 '5'
        System.out.println(c + 1);
//        대문자 A가 아스키 코드가 65이므로 65 + 1 즉, 66에 대응되는 B로 출력
        System.out.println(++c);
//        ++가 전위형으로 작동하므로 1 + 65 즉, B출력
        System.out.println(c++);
//        ++가 후위형으로 작동하므로, 기존 66에서 먼저 호출해서 B출력. 이후 c는 67(C)로
        System.out.println(c);
//        이전에 67(C)가 됐으므로 C출력


//3-3번 문제
        int num = 456;
        System.out.println(num- (num % 100));

//3-4번 문제
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        double d_numOfApples = numOfApples;
        double d_sizeOfBucket = sizeOfBucket;
        double a = Math.ceil(d_numOfApples/d_sizeOfBucket);
        if(d_numOfApples % d_sizeOfBucket != 0){
            int numOfBucket = 1 + (int)a;
        }else{
            int numOfBucket = (int)a;
        }
        int numOfBucket = (int)a; // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 :"+numOfBucket);

//3-5번 문제
//아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!
        int numQ = 10;
        System.out.println((num > 0) ? "양수" : (num == 0) ? "0" :"음수");

//3-6번 문제
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
        int fahrenheit = 100;
        float celcius = 5 / 9f * (fahrenheit - 32);
        celcius *= 100;
        System.out.println("Celcius:"+celcius);

        if(celcius % 1 >= 0.5){
            celcius = celcius - (celcius % 1) + 1;
            System.out.println("Celcius:"+celcius);
        }else{
            celcius -= celcius % 1;
            System.out.println("Celcius:"+celcius);
        }
        celcius /= 100;

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
