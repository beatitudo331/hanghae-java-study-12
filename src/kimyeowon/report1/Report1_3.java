package kimyeowon.report1;
// 2-8 번 문제
public class Report1_3 {
    public static void main(String[] args) {
        int x =1, y=2, z=3;
        int tmp;

        tmp = x;
        x = y;
        y = z;
        z = tmp;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("z = "+z);

    }
}

