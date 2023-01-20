package Kimjinwon.report3;

public class Report3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for(int i=0;i<10;i++){
            for(int j=1;j <= i+1;j++){
                sum += j;
            }
            totalSum+=sum;
        }
        System.out.println("totalSum="+totalSum);
    }
}