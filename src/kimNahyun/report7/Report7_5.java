package kimNahyun.report7;

// 6-21 번 문제
public class Report7_5 {

    static int abs(int value){
        int result;

        result = Math.abs(value);
        return result;
    }
    /* (1) abs 메서드를 작성하시오. */
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10