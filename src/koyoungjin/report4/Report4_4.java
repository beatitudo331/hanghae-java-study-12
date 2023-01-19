package koyoungjin.report4;
// 문제 5-4
// 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
public class Report4_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        // arr이 2차원배열이니까 2중for문
        // arr의 길이만큼 i++

        // 평균 계산변수 (평균이니까 소수점도 구해야되서 float)
        float tmp = 0;

        for(int i=0; i<arr.length; i++){
            // arr길이만큼 계속 더해서 tmp에 담음
            // i 3 , j 4 될때까지 계속 돌면서 누적
            tmp = tmp + arr[i].length;

            // arr[i]의 길이만큼 j++
            for(int j=0; j<arr[i].length; j++){
                // arr[0][0]부터 arr[3][4]까지 다찍기
                total = total + arr[i][j];


            }
        }
        // 총합 나누기 배열 개수
        average = total / tmp;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    } // end of main
}
