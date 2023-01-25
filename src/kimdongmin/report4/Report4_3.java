package kimdongmin.report4;

public class Report4_3 {
}
//5-3 문제
class Exercise5_3{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        /*빈 칸*/
        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        //빈칸끝
        System.out.println("sum="+sum);
    }
}//예상 결과 : sum=150

//정답은 for(int i=0; i < arr.length; i++) {
//            sum += arr[i];
//        }
// 입니다.