package leesangwon.report2;

public class Report2_5 {
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = ((int)((5/9f * (fahrenheit - 32))*100+ 0.5) / 100f);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
//예상 결과 : Fahrenheit:100, Celcius:37.78