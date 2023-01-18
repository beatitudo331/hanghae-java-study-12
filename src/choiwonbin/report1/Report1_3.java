package choiwonbin.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args) {
        int x =1;
        int y= 2;
        int z =3;
        // 정답 작성
        x =2;
        y=3;
        z=1;
        // Ex)
        AddClass addClass = new AddClass();
        addClass.test();
    }
}

// 필요하다면 클래스 추가
class AddClass {
    private int x = 2;
    private int y = 3;
    private int z =1;
    void test() {
        System.out.println("AddClass.test");
    }
}
