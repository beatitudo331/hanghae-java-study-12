package yangyunseon.report6;

//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.
class Exercise6_16 {
    public static void change(String str) { // 기본형 매개변수는 값을 복사해오기 때문에 바꾸지 못함
        str += "456";                       // 참조형 매개변수를 사용해야 주소 값을 가져오기 때문에 값을 바꿀 수 있음.
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str); // ABC123
        change(str);
        System.out.println("After change:" + str); // ABC123
    }
}