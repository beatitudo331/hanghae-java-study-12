package LEESEUNGRYEOL.report2;
// 3-6번 문제
public class Report2_6 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        Calculate_cel calculate_cel = new Calculate_cel();
        calculate_cel.cal(fahrenheit);
    }
}
class Calculate_cel{
    void cal(int fahrenheit)
    {
        float celcius;
        celcius = (float) 5/9 * (fahrenheit -32);
        int a = (int) (celcius * 1000);
        int b = a % 10;
        if (b >= 5)
        {
            a += 10;
        }
        a = a/10;

        celcius = (float) (a * 0.01);

        System.out.println("Fahrenheit:" + fahrenheit);
        System.out.println("Celcius:" + celcius);
    }
}