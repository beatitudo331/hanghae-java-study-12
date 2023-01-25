package jeondabeen.report4;

public class Report4_3 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        //예상 결과 : sum=150
        System.out.println("sum="+sum);
    }
}
