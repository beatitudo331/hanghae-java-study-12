package seoliha.report3;
//4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.
public class Report3_6 {
    public static void main(String[] args) {
        int i, j;
        for(i =1; i < 7; i++){
            for (j=1; j<7;j++){
                int plus = i + j;
                if (plus == 6) {
                    System.out.println("합이 6이 되는 i와 j값은 i= " + i + ", j= " + j);
                }
            }
        }
    }
}
