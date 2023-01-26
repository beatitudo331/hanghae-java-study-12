package kimdoyeon.report7;
// 6-20 번 문제
import java.util.Arrays;

class Report7_4 {
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        } else {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
}
