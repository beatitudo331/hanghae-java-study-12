package leehyunbeen.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        //정답 입력 구간 시작
        int temp = x;
        x = y;
        y = z;
        z = temp;
        //정답 입력 구간 종료

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}