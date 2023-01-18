package koyoungjin.report2;

public class Report2_6 {
    public static void main(String[] args){
        int fahrenheit = 100;
          float celcius = (((int)(5/9f * (fahrenheit - 32)*100))*0.01f)+0.1f;
          float test = (5/9f * (fahrenheit-32)*100);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
        System.out.println("test"+test);

        /*
        화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드
        변환 공식 : 'C = 5/9*(F-32)'
        'C = 5/9*(F-32)' = 37.77778
        37.77778 곱하기 100 은 3777.7778
        int로 소수점버림 : 3777.0
        3777.0 곱하기 0.01f는 37.77
        반올림 수동으로 +0.1f 해서 Celcius 는 37.78

         */
    }
}
