package choiwonbin.report2;

import java.util.Scanner;

// 3-3 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드,
// 만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
// 알맞은 코드를 넣으시오.
public class Report2_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        num1 = sc.nextInt();
        num2 = (num1/100)*100;
        System.out.println("결과 : "+num2);

//        변수를 int로 선언했기 때문에 예를 들어 456입력 후 100으로 나누면 답은 4 거기에 *100을 하면 400
    }
}
