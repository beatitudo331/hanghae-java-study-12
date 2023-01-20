package kimhyunho.report3;

//4-5. 다음의 for문을 while문으로 변경하세요.
class Report3_5 {
    public static void main(String[] args) {
        int i = 0, j = 0;

        while (i < 5) {

//                행     열
//              i = 0 ,j = 0
//              i = 0 ,j = 1
//              i = 1 ,j = 1
//              i = 1 ,j = 2
//              i = 2 ,j = 2
//              i = 2 ,j = 3
//              i = 3 ,j = 3
//              i = 3 ,j = 4
//              i = 4 ,j = 4
//              i = 4 ,j = 5
//              i = 5 ,j = 5


            while (j <= i) {
                System.out.print('*');
                j++;
            }

            i++;
            j = 0;
            System.out.println();
        }//end of main
    } // end of class
}


