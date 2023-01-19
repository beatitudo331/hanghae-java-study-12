package kimNahyun.report3;

// 4-5번 문제
public class Report3_5 {
//    public static void main(String[] args) {
//        for(int i=0; i<=10; i++) {
//            for(int j=0; j<=i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }//end of main

    public static void main(String[] args){
        int i=0;
        int j=0;
        while (i<=10){
            while (j<=i){
                System.out.print("*");
                j++;
            }
            j=0;
            System.out.println();
            i++;
        }
    }
}
