package leeDoGyeong.report3;

public class Report3_5 {


    //4-5. 다음의 for문을 while문으로 변경하세요.

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while ( i <= 10 ) {
            while (j <= i ){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }//end of main


}
