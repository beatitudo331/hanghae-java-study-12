package kimdoyeon.report3;
// 4-9 번 문제
public class Report3_9 {
    public static void main(String[] args) {
        AddClass9 addClass = new AddClass9();
        int num = 12345;
        int sum = addClass.test(num);
        System.out.println("sum="+sum);
    }
}

class AddClass9 {
    int test(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
