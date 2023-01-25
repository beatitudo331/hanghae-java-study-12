package kimdongmin.report3;

public class Report3_9 {
}
//4-9 문제
class Exercise4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        /*빈 칸*/
        while (num >= 1) {
            sum += num % 10;
            num = num / 10;
        }
        //빈칸끝
        System.out.println("sum=" + sum);
    }
}

//정답은 while (num >= 1) {
//            sum += num % 10;
//            num = num / 10;
//        }
//입니다