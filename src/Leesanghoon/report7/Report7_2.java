package Leesanghoon.report7;
// 6-18번 문제
public class Report7_2 {

    static boolean isNumber(String str) {
        // 문자열이 null이거나 공백이면 false 리턴
        if ((str == null) || (str.isEmpty()))
            return false;
        //문자열에서 숫자가 아닌게 있으면 false 리턴
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch))
                return false;
        }
        //그 외는 true 리턴
        return true;
    }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
