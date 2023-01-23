package jominsung.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args) {
        AddClass addClass = new AddClass();
        addClass.test();
//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = 0;

        tmp = x;
        x = y;
        y = z;
        z = tmp;



        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
//예상 결과 : x=2, y=3, z=1


// 필요하다면 클래스 추가
class AddClass {
    void test() {
        System.out.println("AddClass.test");


    }
}
