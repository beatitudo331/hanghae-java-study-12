package choyoungjun.report3;

public class Report3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for (int i=1; i<11; i++){
            sum += i;
            totalSum += sum;
        }
        System.out.println("totalSum="+totalSum);
    }
}
