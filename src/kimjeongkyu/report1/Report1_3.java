package kimjeongkyu.report1;
// 2_8번 문제

public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int tmp = 0;

        tmp = x;
        x = y;
        y = tmp;

        tmp = y;
        y = z;
        z = tmp;


        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}