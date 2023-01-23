package kimNahyun.report7;

// 6-20 번 문제
import java.util.Arrays;
import java.util.ArrayList;
public class Report7_4 {
    /* (1) max 메서드를 작성하시오 . */

    static int max(int[] arr){
        int temp = 0;

        if(arr == null || arr.length == 0){
            return -999999;
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }


        return temp;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
}
//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999