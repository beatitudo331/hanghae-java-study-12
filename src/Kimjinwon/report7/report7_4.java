package Kimjinwon.report7;

public class report7_4 {
    /* (1) max 메서드를 작성하시오 . */
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : "+max(data));
        System.out.println("최대값 : "+max(null));
        System.out.println("최대값 : "+max(new int[]{})); // 크기가 0인 배열  }
    }

    static int max(int[] str){
        if(str == null || str.length == 0)
            return -999999;

        int max = str[0];
        for(int i=1;i<str.length;i++){
            if(max<str[i])
                max = str[i];
        }
        return max;
    }
}
//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999