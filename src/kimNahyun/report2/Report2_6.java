package kimNahyun.report2;

// 3-6번 문제
public class Report2_6 {
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = ((int)((5*(fahrenheit-32)/9.0f)*100.0f+0.5f)/100.0f);

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
