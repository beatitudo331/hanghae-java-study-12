package limminseong.report2;

// 3-5번 문제
public class Report2_5 {
    //3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
    //삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));
    }
}
