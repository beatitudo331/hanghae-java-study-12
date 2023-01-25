package geunhokim.report7;
import java.util.Arrays;
import java.util.Random;

//6-17. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
//        메서드명 : shuffle
//        기능
//        주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//        처리한 배열을 반환한다.
//        반환타입 : int[]
//        매개변수 : int[] arr - 정수값이 담긴 배열
class Exercise6_17 {

    public static int[] shuffle(int[] arr) {

        if(arr == null || arr.length == 0) {
            return arr;

        }

        for(int i = 0; i < arr.length; i++) {

            int j = (int)(Math.random() * arr.length);

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
