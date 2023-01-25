package kimdongmin.report3;
//4_5 문제

public class Report3_5 {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }//end of main
} // end of class


//정답
class answer {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                j++;
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
}