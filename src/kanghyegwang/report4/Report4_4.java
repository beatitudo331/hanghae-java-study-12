//5-4. 2차원 배열 arr에 담긴 모든 총합과 평균을 구하는 프로그램을 완성하세요.

class Exercise5_4 {
    public static void main(String[] args) {
        int[][] arr = {
            { 5, 5, 5, 5, 5 },
            { 10, 10, 10, 10, 10 },
            { 20, 20, 20, 20, 20 },
            { 30, 30, 30, 30, 30 }
        };

	int total = 0;
	float average = 0;

	/*빈 칸*/

	System.out.println("total=" + total);
	System.out.println("average=" + average);
    } // end of main
} // end of class

정답 :

class Exercise5_4 {
    public static void main(String[] args) {
        int[][] arr = {
            { 5, 5, 5, 5, 5 },
            { 10, 10, 10, 10, 10 },
            { 20, 20, 20, 20, 20 },
            { 30, 30, 30, 30, 30 }
        };

        int total = 0;
        float average = 0;
        int cnt = 0;

        for(int i = 0; i < 4; i++) {
             for(int x : arr[i]) {
                 total += x;
                 cnt++;
             }
        }
        average = total/(float)cnt;

        System.out.println("total=" + total);
        System.out.println("average=" + average);
    } // end of main
} // end of class