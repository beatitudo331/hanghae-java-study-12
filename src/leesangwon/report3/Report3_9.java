package leesangwon.report3;
//4-9번 문제
public class Report3_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while (num>0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum="+sum);
    }
}//예상 결과 : sum=15
