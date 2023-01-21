package koyoungjin.report7;


//문제 6-18
public class Report7_2 {
}

class Exercise6_18 {

    public static boolean isNumber(String str) {
        boolean numChk = false;
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9')
                numChk = true;
            else
                numChk = false;
        }
        return numChk;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false