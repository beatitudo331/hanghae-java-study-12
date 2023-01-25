package seoliha.report6;
//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.
class Exercise6_16 {
    public static void change(String str) {
        str += "456";
    }
}

public class Report6_3 {
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}
// 이 코드는 change 메서드의 호출에 문제가 있어서 실행되지 않습니다.
// static이 붙은 변수는 객체없이 사용할 수는 있으나, (클래스 이름).(메서드 이름) 형태로 사용해야 합니다.
// 하여 메인메소드 안을 Exercise6_16.change(str); 로 바꾼다면 실행 가능합니다.
