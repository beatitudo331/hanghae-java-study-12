package leeDoGyeong.report7;

public class Report7_2 {

        static boolean isNumber(String str){
            boolean result = true;
            for(int i = 0; i < str.length(); i++ ){
                int number = str.charAt(i) - 0;
                if(number < 0 || number > 9){
                    result = false;
                    break;
                }
            }
            return result;
        }

        /*isNumber 메서드를 작성하세요.*/

        public static void main(String[] args) {
            String str = "123";
            System.out.println(str + " 는 숫자입니까? " + isNumber(str));
            str = "1234o";
            System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        }

//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false
}
