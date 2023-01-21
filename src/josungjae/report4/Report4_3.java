package josungjae.report4;
// 5-3번 문제
class Report4_3 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum="+sum);
    }
} //예상 결과 : sum = 150
