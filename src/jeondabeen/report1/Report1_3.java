package jeondabeen.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = x;
        x = y;
        y = tmp;
        tmp = z;
        z = y;
        y = tmp;

        //예상 결과 : x=2, y=3, z=1
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        AddClass addClass = new AddClass();
        addClass.test();
    }
}

// 필요하다면 클래스 추가
class AddClass {
    void test() {
        System.out.println("AddClass.test");
    }
}
