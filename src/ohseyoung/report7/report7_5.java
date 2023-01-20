package ohseyoung.report7;
//6-21번 문제
public class report7_5 {
    /* (1) abs 메서드를 작성하시오. */
    static int abs(int value){
        if(value<0){
            value=-value;
        }
        return value;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
