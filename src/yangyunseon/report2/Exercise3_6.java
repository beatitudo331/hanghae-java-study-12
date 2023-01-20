package yangyunseon.report2;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercise3_6 {
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = (float) 5/9*(fahrenheit-32);

        NumberFormat fm = new DecimalFormat("0.##");
        celcius = Float.parseFloat(fm.format(celcius));

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);


    }
}
