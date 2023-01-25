package choiwonbin.report2;

import java.util.Scanner;

//  3-5 아래는 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드
//  삼향연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//  Hint : 삼향 연산자를 두 번 사용할 것
public class Report2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String a =  num > 0 ? "양수":"음수";
        if(num == 0) {
            System.out.println(0);
        }else {
            System.out.println(a);
        }
    }
}


//    문자열로 변수 선언 후 num값이 0보다 크면 양수, 적으면 음수 
//    마지막 조건문으로 num값이 0이랑 같을 때 0 아니면 a값 출력