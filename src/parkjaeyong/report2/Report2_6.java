package parkjaeyong.report2;
// 3-6번 문제
public class Report2_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)(5/9f * (fahrenheit - 32) * 100 + 0.5) / 100f;

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
