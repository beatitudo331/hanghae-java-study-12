//4-5. 다음의 for문을 while문으로 변경하세요.
class Exercise4_5 {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        while (i<=10){
            j=0;
            while (j<=i){
                System.out.print("*");
                j++;
            }
            i++;
        }

    }//end of main
} // end of class