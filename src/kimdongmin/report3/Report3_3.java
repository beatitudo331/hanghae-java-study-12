package kimdongmin.report3;

public class Report3_3 {
}
//4-3 문제

class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        /*빈 칸*/
        for(int i=1;i<=10;i++) {
            sum += i;
            totalSum += sum;
        }
        //빈칸끝

        System.out.println("totalSum="+totalSum);
    }
}
//정답은 220 입니다.