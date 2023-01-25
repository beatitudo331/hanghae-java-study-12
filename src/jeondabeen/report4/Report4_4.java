package jeondabeen.report4;

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

        int numCount = 0;
        for (int[] ints : arr) {
            for (int num : ints) {
                total += num;
                numCount++;
            }
        }

        average = (float) total / numCount;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    } 
}
