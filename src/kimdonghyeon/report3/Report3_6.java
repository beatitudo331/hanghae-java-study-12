package kimdonghyeon.report3;

//4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.
public class Report3_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6)
                    System.out.printf("i = %d j = %d  i+j = %d\n", i, j, i + j);
            }
        }
    }
}
