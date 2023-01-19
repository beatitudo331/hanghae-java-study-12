package limminseong.report3;

// 4-4번 문제 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
// 몇까지 더해야 총합이 100 이상이 되는지 구하세요.
public class Report3_4 {
    public static void main(String[] args) {
        // 정답
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;
        while (sum < 100) {
            ++num;
            sum += s * num;
            s *= -1;
        }
        System.out.println("num="+num);
        System.out.println("sum="+sum);

        // 또 다른 정답
        /*
        int target = 100;
        System.out.println("num="+(target * 2 - 1));
        System.out.println("sum="+target);
         */
    }
}