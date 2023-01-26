package parkjaeyong.report3;
// 4-5번 문제
public class Report3_5 {
    public static void main(String[] args) {
        int i = 0, j=0;
        while (i++ <= 10){
            while (j++ <= i-1)
                System.out.print("*");
            System.out.println();
            j = 0;
        }
    }
}
