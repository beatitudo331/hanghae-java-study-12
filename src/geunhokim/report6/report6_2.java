package geunhokim.report6;

//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.
class Exercise6_16 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123"; // 문자열 str에 "ABC123"값을 초기화
        System.out.println(str); // 문자열 str에 아직 아무런 변화가 없기 때문에 "ABC123" 출력
        change(str); //클래스 메서드 change가 메인 메서드의 str의 주소를 참조 하지만 호출 스택에서 위치가 다르기 때문에,
                     //클래스 메서드에서 str문자열 뒤에 456을 붙여도 기존의 문자열은 아무 지장이 없다.
        System.out.println("After change:" + str); // 문자열 str은 여전히 "ABC123"값을 출력
    }
}