//4-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100 이상이 되는지 구하세요.
package LeeJaeHun.Report3;
//4-6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.
class Report3_6 {
    public static void main(String[] args) {
        for (int i = 1; i<=6 ;i++){
            for (int j =1; j<=6 ; j++){
                if (i+j ==6){

                    System.out.println(i +" * "+ j +" = "+(i+j));
                }
            }

        }
    }
}