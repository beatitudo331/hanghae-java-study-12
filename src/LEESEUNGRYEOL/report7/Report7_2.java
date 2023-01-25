package LEESEUNGRYEOL.report7;
// 6-18 문제
class Exercise6_18 {

    static boolean isNumber(String str){
        int cnt = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>= 48 && str.charAt(i) <=57)
            {
                cnt++;
            }
        }
        if(cnt == str.length())
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false