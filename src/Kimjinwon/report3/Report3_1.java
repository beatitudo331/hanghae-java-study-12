package Kimjinwon.report3;

public class Report3_1 {
    public static void main(String[] args){
        int x = 0;
        char ch = ' ';
        int year = 0;
        boolean powerOn = false;
        String str = "";

        //int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식

        if ( x > 10 && x < 20)
            System.out.println(true);
        else
            System.out.println(false);;

        //char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식

        if (!(ch =='\0') || !(ch =='\t') )
            System.out.println(true);
        else
            System.out.println(false);

        //char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식

        if (ch == 'x' || ch == 'X')
            System.out.println(true);
        else
            System.out.println(false);

        //char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식

        if (ch >= '0' || ch <= '9' )
            System.out.println(true);
        else
            System.out.println(false);

        //char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식

        if ((ch >='A' || ch <='Z') && (ch >='a' || ch <='z'))
            System.out.println(true);
        else
            System.out.println(false);

        //int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식

        if (year%400 == 0 || year%4 == 0 || !(year%100 == 0))
            System.out.println(true);
        else
            System.out.println(false);

        //boolean형 변수 powerOn이 false일 때 true인 조건식

        if (powerOn == false)
            System.out.println(true);
        else
            System.out.println(false);

        //문자열 참조변수 str이 "yes"일 때 true인 조건식

        if ( str == "yes")
            System.out.println(true);
        else
            System.out.println(false);
    }
}
