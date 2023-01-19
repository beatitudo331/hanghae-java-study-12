package studentenglishname.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Exercise2_8{
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;

        int temp = x;
        int temp2 = y;
        y = z;
        z = temp;
        z = temp2;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
