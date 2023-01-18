package kimdaewook.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;
       /*
          알맞은 코드를 넣어 완성하세요.
       */
        int j = x;
        x = y;
        y = z;
        z = j;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        //예상 결과 : x=2, y=3, z=1
    }
}
