package kyungyeon.report1;

// 2-8 번 문제   <- 이렇게 문제 번호 작성 필수.

public class Report1_3 {
    public static void main(String[] args) {

        // 2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요
        // 예상 결과 : x=2, y=3, z=1
        int x = 1;
        int y = 2;
        int z = 3;

        // 정답
        // 아래 addClass가 뭘 원하는지 모르겠어서 2가지 형태로 답을 냈습니다.

        // 첫번째.
        int temp = x;
        x = y;
        y = z;
        z = temp;
        System.out.println("첫번째");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
        System.out.println();

        // 두번째.
        x = 1;
        y = 2;
        z = 3;
        AddClass addClass = new AddClass(x, y, z);
        addClass.test();
    }
}


// 필요하다면 클래스 추가
class AddClass {
    int x;
    int y;
    int z;

    public AddClass(int x, int y, int z) {
        this.x = y;
        this.y = z;
        this.z = x;
    }

    void test() {
        System.out.println("두번째");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
