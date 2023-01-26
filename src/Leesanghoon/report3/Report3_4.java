package Leesanghoon.report3;

import static java.lang.Math.abs;

public class Report3_4 {
    public static void main(String[] args) {
        int sum = 1;
        int i = 1;
        while (sum<100) {
            if(abs(i) % 2 == 1)
                i = (i+1)*-1;
            else
                i = abs(i)+1;
            sum += i;
        }
        System.out.println("i = " + i);
    }
}
