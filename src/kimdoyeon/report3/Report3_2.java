package kimdoyeon.report3;
// 4-2 번 문제
public class Report3_2 {
    public static void main(String[] args) {
        AddClass2 addClass = new AddClass2();
        int sum = addClass.test();
        System.out.println("sum="+sum);
    }
}

// 필요하다면 클래스 추가
class AddClass2 {
    int test() {
        int sum = 0;
        for (int num = 1; num <= 20; num++) {
            if (num % 2 != 0 && num % 3 != 0)
                sum += num;
        }
        return sum;
    }
}
