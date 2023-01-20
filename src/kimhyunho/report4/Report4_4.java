package kimhyunho.report4;

//5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.
class Report4_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

//        arr[0][0]+arr[0][1]+arr[0][2]+arr[0][3]+arr[0][4]
//        arr[1][0]+arr[1][1]+arr[1][2]+arr[1][3]+arr[1][4]
//        arr[2][0]+arr[2][1]+arr[2][2]+arr[2][3]+arr[2][4]
//        arr[3][0]+arr[3][1]+arr[3][2]+arr[3][3]+arr[3][4]

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "] arr[" + j + "] " + arr[i][j]);

                total += arr[i][j];
            }
        }
         average = (float)total/ (arr.length * arr[0].length);

//
        System.out.println("total=" + total);
        System.out.println("average=" + average);
    } // end of main
} // end of class

/// 부등호 <= 에서 < 으로 바뀌니까 바로 출력됨


