package leeDoGyeong.report3;

public class Report3_3 {

    //4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.

        public static void main(String[] args) {
            int sum = 0;
            int totalSum = 0;

            int num = 1;
            for(int i = 0; i < 10; i++){
                sum += num;
                totalSum += sum;
                num++;
            }

            System.out.println("totalSum="+totalSum);
        }




}
