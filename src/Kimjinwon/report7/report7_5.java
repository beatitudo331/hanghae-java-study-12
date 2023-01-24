package Kimjinwon.report7;

public class report7_5 {
    /* (1) abs 메서드를 작성하시오. */
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }

    static int abs(int num){
        if(num < 0)
            return -num;
        return num;
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
