package choiwonbin.report2;

import java.util.Scanner;

//  3-6 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드
//  변환 공식이 'C= 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오
//  단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것
public class Report2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fahrenheif = 100;
        float celcius = 5/9*(fahrenheif-32);
        System.out.println(String.format("%.2f",celcius));


        double a = sc.nextDouble();
        System.out.println("정답은 : "+String.format("%.2f",a));

    }
}
