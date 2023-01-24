package day3.homework.report7;
/*
6-17. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
메서드명 : shuffle
기능
주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
처리한 배열을 반환한다.
반환타입 : int[]
매개변수 : int[] arr - 정수값이 담긴 배열
class Exercise6_17 {

    /*shuffle 메서드를 작성하세요. */

public class report7_1 {
    public static int[] shuffle(int[] arr) {
        if (arr == null || arr.length == 0)


            //배열위치 바꾸는 작업을 반복하여 뒤섞이게 한다. =>2배정도 횟수?
            for (int x = 0; x < arr.length * 2; x++) {
                //배열 내에서 임의 두값을 얻기
                int i = (int) (Math.random() * arr.length);
                int j = (int) (Math.random() * arr.length);
                //2일차의 임의의 정수 만들기 참고!!

                // arr[i]와 arr[j]의 값을 서로 바꾼다.
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

    }
}
