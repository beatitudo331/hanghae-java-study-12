package choiwonbin.report3;
// 4-2
public class Report3_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
}
//      int sum 변수 초기화하고 반복문(for문)으로 i가 2또는 3의 배수가 아닐 때만 sum에 i를 더합니다.