package ohseyoung.report4;
// 5-3번 문제
public class report4_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("sum="+sum);
    }
}
