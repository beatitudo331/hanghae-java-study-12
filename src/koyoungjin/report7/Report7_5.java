package koyoungjin.report7;

import static java.lang.Math.abs;

//문제 6-21
public class Report7_5 {
}

class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    public static int abs(int value) {
        value = value >=0 ? value : -value;
        return value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10