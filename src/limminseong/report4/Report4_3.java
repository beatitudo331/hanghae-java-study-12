package limminseong.report4;

import java.util.Arrays;

//5-3번 문제 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
public class Report4_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // 정답 1
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        System.out.println("sum=" + sum);

        // 정답 2
        // System.out.println("sum=" + Arrays.stream(arr).sum());
    }
}//예상 결과 : sum=150