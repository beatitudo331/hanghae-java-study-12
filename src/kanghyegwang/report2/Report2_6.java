package studentenglishname.report2;
import java.util.Scanner;
// 3-6번 문제
public class Report2_6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int fahrenheit = kb.nextInt();
        float celcius = ((int)((5*(fahrenheit-32)/9.0f)*100 + 0.5f)/100.0f);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}