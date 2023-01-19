package koyoungjin.report4;
// 문제 5-3
// 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
public class Report4_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // i=0부터 arr길이까지돌림
        for (int i = 0; i < arr.length; i++) {
            // 계속 더해줌
            sum += arr[i];
        }

        System.out.println("sum=" + sum);
    }
}
