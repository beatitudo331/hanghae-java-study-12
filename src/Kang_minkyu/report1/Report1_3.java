package Kang_minkyu.report1;

//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        // 이하 정답
        int a = x;

        x = y;
        y = z;
        z = a;

        //

        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);


    }
}
