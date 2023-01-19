package Kang_minkyu.report4;
//4-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
public class Report4_4 {
    public static void main(String[] args){
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        int total = 0;
        float average = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                total += arr[i][j];
                num++;
            }
                average = (float) total/num;
        }

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    } //end of main
}//end of class

