package studentenglishname.report1;
// 2-8번 예제
public class Report1_3 {
    public static void main(String[] args) {
        // 정답 작성
        int x = 1;
        int y = 2;
        int z = 3;
        int tmp = x;
        x = y;
        y = z;
        z = tmp;
        // Ex)
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
