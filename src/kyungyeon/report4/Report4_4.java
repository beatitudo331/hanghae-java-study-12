package kyungyeon.report4;

public class Report4_4 {
    public static void main(String[] args) {
        //5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;
        int count = 0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                total += anInt;
                count++;
            }
        }

        average = (float) total / count;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
