package seoliha.report1;
// 2-8 번 문제
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int temp;
        temp = x;
        x = y;
        y = z;
        z = temp;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        //예상 결과 : x=2, y=3, z=1
    }
}

// 필요하다면 클래스 추가
class AddClass {
    void test() {
        System.out.println("AddClass.test");
    }
}
