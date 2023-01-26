package yuyeongwoo.report7;
//문제 6-17번
public class report7_1 {
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int tmp = 0;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}
