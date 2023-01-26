package kimjuhui.report3;

public class Report3_1 {
    public static void main(String[] args) {
        //int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        int x = 11;
        if(x > 10 && x < 20) {
            System.out.println("x는 10보다 크고 20보다 작습니다.");
        }

        //char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        char ch1 = ' ';
        if(ch1 != ' ' || ch1 != '\t') {
            System.out.println("ch1는 공백이나 탭이 아닙니다.");
        }

        //char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        // (ch 변수이름이 중복되어 ch 뒤에 숫자를 붙였습니다.)
        char ch2 = 'x';
        if(ch2 == 'x' || ch2 == 'X') {
            System.out.println("ch2는 'x' 또는 'X' 입니다.");
        }

        //char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
        char ch3 = '9';
        if(ch3 >= '0' && ch3 <= '9') {
            System.out.println("ch3은 '0'~'9'입니다.");
        }

        //char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        char ch4 = 'Z';
        if((ch4 >= 'a' && ch4 <= 'z') || (ch4 >= 'A' && ch4 <= 'Z')) {
            System.out.println("ch4는 'a' ~ 'z' 이거나 'A' ~ 'Z' 입니다.");
        }

        //int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식
        int year = 480;
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("year은 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않습니다.");
        }

        //boolean형 변수 powerOn이 false일 때 true인 조건식
        boolean powerOn = false;
        if(powerOn == false) {
            System.out.println("powerOn은 false 입니다.");
        }


        //문자열 참조변수 str이 "yes"일 때 true인 조건식
        String str = "yes";
        if(str.equals("yes")) {
            System.out.println("str은 \"yes\" 입니다.");
        }
    }
}
