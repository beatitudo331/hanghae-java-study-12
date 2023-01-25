package kimNahyun.report3;

//4-7번 문제
public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        int stri = Integer.parseInt(str);

        //sum = sum + str%10;
        //sum = sum + (str/10)%10;
        //sum = sum + ((str/10)/10)%10;

        for (int i = 0; i < str.length(); i++) {
            sum += stri%10;
            stri /=10;
        }

        System.out.println("sum=" + sum);
    }
}//예상 결과 : sum=15
