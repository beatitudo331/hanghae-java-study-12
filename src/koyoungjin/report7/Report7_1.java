package koyoungjin.report7;

import static java.util.Collections.shuffle;
//문제 6-17
public class Report7_1 {

}

class Exercise6_17 {

    public static int[] shuffle(int[] arr) {
        if (arr == null || arr.length == 0)
            return arr;
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);

            // arr[i] arr[j] . 와 의 값을 서로 바꾼다
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