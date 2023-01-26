package parkjaeyong.report4;
// 5-4번 문제
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
        int count = 0;
        for (int[] a : arr) {
            count += a.length;
            for (int b : a) {
                total += b;
            }
        }
        average = (float)total / count;
        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
