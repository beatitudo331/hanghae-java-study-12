package parkjaeyong.report6;
// 6-16번 문제
//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.

/**
 * [출력결과]
 * ABC123이 출력된다.
 * After change:ABC123이 출력된다.
 *
 * => str이 참조변수여서 마치 change()호출하여 문자열을 합쳐도 참조하고 있기에 더해질 것이라 생각할수 있다.
 * 그러나 문자열의 경우 한번 지정되면 문자열을 바꿀 수 없으면 문자열을 더하거나 하는 경우는 모두
 * 새로운 주소를 갖는 String 클래스 인스턴스를 생성하고 값을 저장하는 방식이다. 그렇기에
 * 메서드 호출을 마치고 돌아와도 main함수의 str은 "ABC123"값을 저장하고 있는 String 클래스의 인스턴스를 참조하고 있다.
 */
public class Report6_16 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}
