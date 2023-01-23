// 5-4번 문제
class Exercise5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 5, 5, 5, 5, 5 },
                { 10, 10, 10, 10, 10 },
                { 20, 20, 20, 20, 20 },
                { 30, 30, 30, 30, 30 }
        };

        int total = 0;
        float average = 0;

        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                total += ints[j];
                average = (float) total / (arr.length * arr.length);
            }
        }

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}