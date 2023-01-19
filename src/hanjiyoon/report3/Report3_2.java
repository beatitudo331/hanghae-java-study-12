package hanjiyoon.report3;
//4-2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.

public class Report3_2 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i=1; i<11; i++) {
            sum += i;   // sum 1, 1+2,
            totalSum += sum; // 1, 1+(1+2)
        }
        System.out.println("totalSum="+totalSum);
    }
}