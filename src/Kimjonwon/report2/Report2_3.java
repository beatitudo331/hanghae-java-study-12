package Kimjonwon.report2;

public class Report2_3 {
    //3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
    public static void main(String[] args){
        int num = 456;
        System.out.println("값은 : " + num/100 * 100);
    }
}
