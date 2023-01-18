package jeondabeen.report2;

public class Report2_6 {
    public static void main(String[] args){
        int fahrenheit = 100;
        float celcius = 5F / 9 * (fahrenheit - 32);
        int tmp = (int) (celcius * 1000);
        float result = tmp % 10 >= 5 ? (tmp - (tmp % 10) + 10) / 1000F : tmp - (tmp % 10) / 1000F;

        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + result);
        //예상 결과 : Fahrenheit:100, Celcius:37.78
    }
}
