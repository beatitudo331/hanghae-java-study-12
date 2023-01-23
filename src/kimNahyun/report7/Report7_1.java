package kimNahyun.report7;

// 6-17 번 문제
import java.util.Arrays;
public class Report7_1 {

    static int[] shuffle(int[] arr){

        int[] result = arr.clone();
        //clone() 메소드는 자신을 복제하여 새로운 인스턴스를 생성하는 일을 한다.

        for(int i=0; i<result.length;i++){
            int j = (int)(Math.random()*result.length);
            int tmp = 0;

            tmp = result[i];
            result[i]=result[j];
            result[j]=tmp;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
