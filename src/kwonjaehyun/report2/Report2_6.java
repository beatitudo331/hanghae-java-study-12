package kwonjaehyun.report2;
//3-6 번 문제
public class Report2_6 {
    public static void main(String[] args) {// Celcius:37.78
        int fahrenheit = 100;
        float celcius = (float)
                (
                (((double)5/(double)9)*(fahrenheit-32)*100)>0.5?
                Math.ceil(((double)5/(double)9)*(fahrenheit-32)*100)
                :
                Math.floor(((double)5/(double)9)*(fahrenheit-32))*100
                ) /100;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
