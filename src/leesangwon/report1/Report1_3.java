package leesangwon.report1;
// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수
public class Report1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        // 정답 작성
        int tmp = x;    //x의 값을 tmp에 저장
        x = y;          //y의 값을 x에 저장
        y = z;          //z의 값을 y에 저장
        z = tmp;        //tmp에 저장된 값을 z에 저장


        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

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
