package LISHANYU.Report3;
//4-7. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
//만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 합니다.
public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        int num = Integer.parseInt(str);
        for (int i = 0; i < (str.length()); i++) {
            int a = num%10;
            sum += a;
            num = num/10;
//            System.out.printf("i=%d num=%d a=%d sum=%d%n",i,num,a,sum);
        }
        System.out.println("sum=" + sum);
    }
}
