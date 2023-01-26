package kimjuhui.report7;

public class Report7_20 {
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }

    public static int max(int[] arr) {

        if(arr == null || arr.length == 0) {
            return -999999;
        }

        int maxNum = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }
}//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999





