package yuyeongwoo.report7;
//6-21번
public class report7_5 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }

    public static int abs(int value) {
        return value < 0 ? -value : value;
    }
}
