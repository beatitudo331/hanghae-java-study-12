package kimdoyeon.report3;
// 4-3 번 문제
public class Report3_3 {
    public static void main(String[] args) {
        AddClass3 addClass = new AddClass3();
        int totalSum = addClass.test();
        System.out.println("totalSum="+totalSum);
    }
}

class AddClass3 {
    int test() {
        int sum = 0;
        int totalSum = 0;
        for (int num = 1; num <= 10; num++) {
            sum += num;
            totalSum += sum;
        }
        return totalSum;
    }
}
