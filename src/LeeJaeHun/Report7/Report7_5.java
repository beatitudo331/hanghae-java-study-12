package LeeJaeHun.Report7;

//메서드명: abs
//        기능 : 주어진 값의 절대값을 반환한다.
//        반환타입 : int
//        매개변수 : int value
public class Report7_5 {

    public static int abs(int value){

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

