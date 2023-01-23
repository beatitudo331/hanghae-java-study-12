package jominsung.report3;

public class Report3_7 {
    public static void main(String[] args) {
        //4-7. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
    //만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 합니다.
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println("sum=" + sum);
    }
}//예상 결과 : sum=15

