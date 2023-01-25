package leeDoGyeong.report6;

public class Report6_9 {
    //6-16. 다음 코드의 실행 결과를 예측하여 적어주세요.

        public static void change(String str) {
            str += "456";
        }

        public static void main(String[] args) {
            String str = "ABC123";
            System.out.println(str);
            change(str);
            System.out.println("After change:" + str);
        }
    //결과 예상 : ABC123456
}
