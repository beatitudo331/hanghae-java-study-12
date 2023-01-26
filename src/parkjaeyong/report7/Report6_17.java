package parkjaeyong.report7;
//6-17 문제

import java.util.Arrays;

/**
 *  메서드명 : shuffle
 *  기능
 *      주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
 *      처리한 배열을 반환한다.
 * 반환타입 : int[]
 * 매개변수 : int[] arr - 정수값이 담긴 배열
 */
public class Report6_17 {

    public static int[] shuffle(int[] arr){
        int tmp = 0;
        for(int i = 0 ; i < arr.length; i++){
            int rNum = (int)(Math.random() * arr.length) ; // 0 ~ length -1 까지 임의로 선택
            tmp = arr[0];
            arr[0] = arr[rNum];
            arr[rNum] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
