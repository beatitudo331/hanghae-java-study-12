package kimdoyeon.report3;
// 4-5 번 문제
public class Report3_5 {
    public static void main(String[] args) {
        int i = 0, j;
        while (i <= 10) {
            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
