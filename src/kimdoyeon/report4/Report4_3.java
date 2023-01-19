package kimdoyeon.report4;
// 5-3 번 문제
public class Report4_3 {
    public static void main(String[] args) {
        AddClass3 addClass = new AddClass3();
        int[] arr = {10, 20, 30, 40, 50};
        int sum = addClass.test(arr);
        System.out.println("sum="+sum);
    }
}

class AddClass3 {
    int test(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
