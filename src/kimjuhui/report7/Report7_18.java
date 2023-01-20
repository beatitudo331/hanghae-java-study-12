package kimjuhui.report7;

public class Report7_18 {
    /*isNumber 메서드를 작성하세요.*/
    public static boolean isNumber(String str) {
        boolean numberCheck = true;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp > 57 || temp < 48) {
                numberCheck = false;
            }
        }
        return numberCheck;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false


