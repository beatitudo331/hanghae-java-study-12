package yuyeongwoo.report7;
//문제 6-18번
public class report7_2 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }

    public static boolean isNumber(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            if (0 > a || a > 9) {
                return false;
            }
        }
        return true;
    }
}