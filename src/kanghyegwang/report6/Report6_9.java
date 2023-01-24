//6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.
class Exercise6_16 {
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

정답 :
class Exercise6_16 {
    public static void change(String str) {
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str); // ABC123 출력
        change(str);
        System.out.println("After change:" + str); // ABC123 출력
    }
}
처음 str을 추력할때는 String str = "ABC123"; 을 그대로 가져오고
change(str); 에서 change메서드에 "ABC123" 을 매개변수로 받아서 "ABC123456"으로 만들지만
main의 str과 change의 str은 다른 객체 주소를 가지고 있어서 마지막 System.out.println("After change:" + str);에서
str은 change의 객체주소가 아닌 main의 str객체주소를 가지고 있어서 ABC123을 출력하게 된다