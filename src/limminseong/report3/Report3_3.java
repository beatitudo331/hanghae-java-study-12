package limminseong.report3;

// 4-3번 문제 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.
public class Report3_3 {
    public static void main(String[] args) {
        // 정답
        int sum = 0;
        int totalSum = 0;
        int n = 10;
        totalSum = ((n * (n + 1) / 2) + ((n * (n + 1) * (2 * n + 1)) / 6)) / 2;
        System.out.println("totalSum="+totalSum);
    }
}
