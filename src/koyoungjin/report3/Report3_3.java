package koyoungjin.report3;
// 4-3 문제
// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.
public class Report3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        // 뒤에 1 ... 10까지
        for (int i=1; i<=10; i++){
            //sum에 더해줌 그럼 1+2+3+4+5+6+7+8+9+10 까지됨
            sum += i;
//            System.out.println(sum);
            //토탈썸에 다 더해주기
            totalSum += sum;
        }
        System.out.println("totalSum=" + totalSum);
    }
}
