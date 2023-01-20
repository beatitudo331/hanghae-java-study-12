package Kimjinwon.report3;

public class Report3_6 {
    public static void main(String[] args) {
        int con = 0;

        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                if(i + j == 6)
                    con++;
            }
        }
        System.out.println("모든 경우의 수는 : " + con);
    }
}