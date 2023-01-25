package HongYeSeok.report3;

// 4-5번 문제
// 다음의 for문을 while문으로 변경하세요.
public class Report3_5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (i < 10) {
            i++;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            j = 0;
            System.out.println();
        }
    }
}
