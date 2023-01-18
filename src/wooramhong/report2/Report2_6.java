package wooramhong.report2;

public class Report2_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        double celcius = Math.floor(((float)5/9 *(fahrenheit-32))*100) > ((float)5/9 *(fahrenheit-32))*100 -0.5? Math.floor(((float)5/9 *(fahrenheit-32))*100)/100 : Math.floor(((float)5/9 *(fahrenheit-32))*100)/100+0.01;

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
