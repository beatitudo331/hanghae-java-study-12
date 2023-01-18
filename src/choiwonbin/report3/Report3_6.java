package choiwonbin.report3;

public class Report3_6 {
    public static void main(String[] args) {
        //두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요.

        int value = 0;


        while(value < 6) {
            value++;
            for(int i = 1 ; i <=6 ; i++) {
                if(value+i == 6) {
                    System.out.print("value=" + value + "  ");
                    System.out.println("i=" + i);
                }
            }
        }
    }
}


