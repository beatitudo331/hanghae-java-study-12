package Kimjinwon.report7;

public class report7_2 {

    /*isNumber 메서드를 작성하세요.*/
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }

    static boolean isNumber(String a){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) >= 48 || a.charAt(i) <=57)
                return false;
        }
        if (a==null || a.equals(""))
            return false;

        return true;
    }
}