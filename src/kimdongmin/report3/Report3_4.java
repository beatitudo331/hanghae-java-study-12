package kimdongmin.report3;

public class Report3_4 {
}
//4_4 문제
class Exercise4_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;
        /*빈 칸*/
        while (true){
            if(sum >= 100)
                break;
            num++;
            sum += num*s;
            s = -s;
        }
        //빈칸끝
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
//정답은 199 입니다.