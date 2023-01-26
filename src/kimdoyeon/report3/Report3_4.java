package kimdoyeon.report3;
// 4- 4 번 문제
public class Report3_4 {
    public static void main(String[] args) {
        AddClass4 addClass = new AddClass4();
        int[] ans = addClass.test();
        int num = ans[0];
        int sum = ans[1];
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}

class AddClass4 {
    int[] test() {
        int sum = 0;
        int s = 1;
        int num = 0;
        while (sum < 100) {
            sum += ++num * s;
            s *= -1;
        }
        return new int[]{num, sum};
    }
}
