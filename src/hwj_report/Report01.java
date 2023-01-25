package hwj_report;

public class Report01 {
    public static void main(String[] args) {

        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
//      byte b = 256; "오류"   원인 : 저장 가능한 값의 범위를 넘어가기 때문
//      char c = ''; "오류"   원인 : 빈 문자열은 선언 가능하지 않기 때문
//      char answer = 'no'; "오류"   원인 : 변수타입 char은 문자 하나만 가능하기 때문
//      float f = 3.14; "오류"   원인 : float 타입 변수에 실수를 할당할 때에는 실수값 뒤에 별도로 f나 F를 추가해야 하기 때문
        double d = 1.4e3f;

        //2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println(true+"");
        System.out.println('A' + 'B');
        System.out.println('1' + 2);
        System.out.println('1' + '2');
        System.out.println('J' +"ava");
        //System.out.println(true + null); 오류


        //2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
        int x = 1;
        int y = 2;
        int z = 3;

        x = x + 1;
        y = y + 1;
        z = z -2;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

    }

}
