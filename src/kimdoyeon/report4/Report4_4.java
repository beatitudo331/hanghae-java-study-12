package kimdoyeon.report4;
// 5-4 번 문제
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
        int length = 0;
        for (int[] i : arr) {
            for (int j : i) {
                total += j;
                length++;
            }
        }
        average = (float) total / length;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
