package koyoungjin.report3;
// 문제 4-6
// . 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.
public class Report3_6 {
    public static void main(String[] args) {
        // 첫번 째 주사위
        for(int i=1; i<=6; i++){
            // 두번 째 주사위
            for(int j=1; j<=6; j++){
                // 눈의 합이 6이 될 때
                if((i+j)==6){
                    // 합이 6이 되는 경우를 출력
                    System.out.println(i+j);
                }else{
                    // 아님말고
                    System.out.print("");
                }
            }
        }

        System.out.println();
    }
}
