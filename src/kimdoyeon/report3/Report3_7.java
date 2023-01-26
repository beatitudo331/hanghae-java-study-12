package kimdoyeon.report3;
// 4-7 번 문제
public class Report3_7 {
    public static void main(String[] args) {
        AddClass7 addClass = new AddClass7();
        String str = "12345";
        int sum = addClass.test(str);
        System.out.println("sum=" + sum);
    }
}

class AddClass7 {
    int test(String str){
        int num = Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
