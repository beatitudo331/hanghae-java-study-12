package jeondabeen.report7;

public class Report7_4 {
    static int max(int[] arr) {
        int result = 0;

        if (arr == null || arr.length == 0) return -999999;

        for (int num : arr) {
            if (num > result) result = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
    //예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999
}
