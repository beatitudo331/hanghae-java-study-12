package choyoungjun.report4;

public class Report4_4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        int total = 0;
        float average = 0;
        float length = 0;
        for (int[] intArr : arr){
            length += intArr.length;
            for (int i=0; i<intArr.length; i++){
                total += intArr[i];
            }
        }
        average = total/length;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
