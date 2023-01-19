package choiwonbin.report3;
// 4-3
public class Report3_3 {
    public static void main(String[] args) {
        int sum =0;
        int totalSum = 0;
        for (int i=1; i <=10; i++){
            sum += i;
            totalSum+=sum;
        }
        System.out.println("totalSum= "+totalSum);
    }
}
//      i 값을 누적해서 sum에 저장 후 sum에 값도 누적시켜서 저장한 후 저장한 값을 totalSum에 저장시켜서 출력하면 220
