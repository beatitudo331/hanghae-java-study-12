//6-18번 문제
public class report7_2 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
    static boolean isNumber(String str){
        boolean isTrue = false;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                isTrue=true;
            }
            else isTrue=false;
        }
        return isTrue;
    }
}