package Kang_minkyu.report3;
//3-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.
public class Report3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for (int i=0; i <= 10; i++) {
            sum += i;
            totalSum += sum;
        }
        System.out.println("totalSum = " + totalSum);
    }
}
