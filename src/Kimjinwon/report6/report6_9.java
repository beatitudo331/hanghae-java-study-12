package Kimjinwon.report6;

public class report6_9 {
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

정답
 ABC123
 After change:ABC123

해설
 - 문자열은 변경이 불가능하여 새로운 문자열 주소가 change에 저장.