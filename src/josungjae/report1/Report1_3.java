package josungjae.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        z = x;
        x = y;
        y = y + z;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

    }
}