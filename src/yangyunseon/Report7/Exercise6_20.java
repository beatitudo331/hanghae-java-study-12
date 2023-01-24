package yangyunseon.Report7;

import java.util.Arrays;

class Exercise6_20 {
    /* (1) max 메서드를 작성하시오 . */
    static int max(int[] arr) {
        if (arr == null || arr.length == 0)
            return -999999;
        int n = 0;
        Arrays.sort(arr);
        n = arr[arr.length - 1];
        return n;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :" + max(data));
        System.out.println("최대값 :" + max(null));
        System.out.println("최대값  :" + max(new int[]{})); // 크기가 0인 배열  }
    }
}

//예상 결과 : 최대값: 9 / 최대값: -999999 최대값: -999999