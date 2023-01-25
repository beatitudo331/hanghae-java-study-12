package kwonjaehyun.report3;
//4-7
//4-7. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum = (str.charAt(i)-48)+sum;
        }
        System.out.println("sum=" + sum);
    }
}
