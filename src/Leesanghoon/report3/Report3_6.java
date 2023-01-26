package Leesanghoon.report3;

public class Report3_6 {
    public static void main(String[] args) {
        int i,j;
        for(i = 1; i<=6; i++) {
            for(j =1; j<=6; j++) {
                if(i + j ==6)
                    System.out.printf("i, j = (%d, %d)\n", i,j);
            }
        }
    }
}
