package parkjaeyong.report3;
// 4-3번 문제
public class Report3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for (int i = 1; i <= 10 ; i++)
            totalSum += sum += i;
        System.out.println("totalSum = " + totalSum);
    }
}
