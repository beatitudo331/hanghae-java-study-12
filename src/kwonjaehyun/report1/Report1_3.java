package kwonjaehyun.report1;
// 2-8 번 문제
//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
//예상 결과 : x=2, y=3, z=1
public class Report1_3 {
    public static void main(String[] args) {
        // 정답 작성
        // Ex)
        int x = 1;
        int y = 2;
        int z = 3;
        int tmp;

        tmp = x;//tmp = 1
        x = y;//x = 2
        y = z;//y = 3
        z = tmp;//z = 1

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}