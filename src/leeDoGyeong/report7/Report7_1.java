package leeDoGyeong.report7;

public class Report7_1 {

        static int[] shuffle(int[] arr) {
            int[] result = arr.clone();

            for(int i = 0; i < result.length; i++){
                int j = (int)(Math.random()* result.length);
                int tmp = result[0];
                result[0] = result[j];
                result[j] = tmp;
            }
            return result;
        }
        /*shuffle 메서드를 작성하세요. */

        public static void main(String[] args) {
            int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            System.out.println(java.util.Arrays.toString(original));

            int[] result = shuffle(original);
            System.out.println(java.util.Arrays.toString(result));
        }
}

