package yangyunseon.report3;

public class Exercise4_5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---for>>>while-----------");
        int i = 0;
        while (i <= 10) {
            int j=0;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }//end of main
} // end of class