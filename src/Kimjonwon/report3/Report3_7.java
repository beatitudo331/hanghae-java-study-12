package Kimjonwon.report3;

public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) -'0';  // ASCII 코드에서 문자 코드 값을 - 하면 숫자를 얻을 수 있다.
        }

        System.out.println("sum=" + sum);
    }
}//예상 결과 : sum=15
