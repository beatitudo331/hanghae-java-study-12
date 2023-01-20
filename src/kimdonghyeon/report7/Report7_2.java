package kimdonghyeon.report7;

// 6-17번 문제
public class Report7_2 {
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
