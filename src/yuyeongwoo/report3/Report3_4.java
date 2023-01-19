package yuyeongwoo.report3;
// 4-4번 문제
public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0;
        int s = 1;
        int num = 0;
        for (int i = 1; true; i++) {
            sum += i * s;
            if (sum >= 100) {
                num = i * s;
                break;
            }
            s = -s;
        }
        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }
}
