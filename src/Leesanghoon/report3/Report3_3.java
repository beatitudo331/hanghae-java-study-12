package Leesanghoon.report3;

public class Report3_3 {
    public static void main(String[] args) {
        int i,j;
        int sum = 0;
        for(i = 0; i <= 9; i++) {
            for(j = 1; j <= 10; j++) {
                if(j >= i)
                    sum += j - i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
