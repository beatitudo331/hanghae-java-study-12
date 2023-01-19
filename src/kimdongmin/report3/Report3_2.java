package kimdongmin.report3;

public class Report3_2 {

}
//4-2 문제
class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        /*빈 칸*/
        for(int i=1;i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0)
                continue;
            sum  += i ;
        }
        //빈칸끝
        System.out.println("sum="+sum);
    }
}

//정답은 73 입니다.