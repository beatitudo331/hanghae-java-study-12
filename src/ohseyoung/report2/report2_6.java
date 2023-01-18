package ohseyoung.report2;
// 3-6번 문제
public class report2_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = Float.parseFloat(String.format("%.2f",(float) 5/9*(fahrenheit-32)));
        celcius= Float.parseFloat(String.format("%.2f",celcius));

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
