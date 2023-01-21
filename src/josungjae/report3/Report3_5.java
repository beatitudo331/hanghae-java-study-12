package josungjae.report3;
//4_5번 문제
class Report3_5 {
    public static void main(String[] args) {
//        for(int i=0; i<=10; i++) {
//            for(int j=0; j<=i; j++)

        int i = 0;
        while (i <= 10) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            } System.out.println();
            i++;
        }
    }//end of main
} // end of class
