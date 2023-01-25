package leeDoGyeong.report7;

public class Report7_5 {
    /* (1) abs 메서드를 작성하시오. */
    static int abs(int value) {
        return Math.abs(value);
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10