package LeeGeonHo.report7;
//메서드명: abs
//        기능 : 주어진 값의 절대값을 반환한다.
//        반환타입 : int
//        매개변수 : int value
class Exercise6_21 {
    public static int abs(int value){
        if(value<0){
            return value*-1;
        }else{
            return value;
        }
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}