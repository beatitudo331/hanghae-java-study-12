package kimjeongkyu.report7;


class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    public static int abs(int value) {
        if (value < 0) {
            return value *= -1;
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
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
