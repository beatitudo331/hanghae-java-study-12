package koyoungjin.report3;
// 문제 4-7
// 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
// 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 합니다.
public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        // str 의 길이만큼. 0 1 2 3 4 까지
        for (int i = 0; i < str.length(); i++) {
            // charAt 로 해당위치(i)의 있는 값을 sum에 더함
            // 문자열이었기때문에 int로 형변환
            sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        System.out.println("sum=" + sum);
    }
}
