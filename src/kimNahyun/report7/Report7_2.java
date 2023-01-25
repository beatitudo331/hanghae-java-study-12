package kimNahyun.report7;

// 6-18 번 문제
public class Report7_2 {
    //String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.


    static boolean isNumber(String str){
        boolean result = true;
        if(str.equals("")){
            result = false;
        }
        for(int i =0; i<str.length();i++){
            int num = str.charAt(i);
            if(num<48 || num>58){
                result = false;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}

//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false