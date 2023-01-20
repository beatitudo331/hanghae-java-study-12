package Kimjinwon.report3;

public class Report3_5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(i<=10){
            while(j<=i){
                System.out.print("*");
                j++;
            }
            j = 0;
            i++;
            System.out.println();
        }
    }//end of main
} // end of class