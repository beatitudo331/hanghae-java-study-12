package kimyuyoung.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수

public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int tmp;

        tmp = x;
        x = z;
        z = tmp;

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println("tmp=" + tmp);

    }
}

