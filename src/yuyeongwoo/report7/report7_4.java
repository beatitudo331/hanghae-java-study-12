package yuyeongwoo.report7;
//6-20번
import java.util.Arrays;

public class report7_4 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[]{}));
    }

    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
