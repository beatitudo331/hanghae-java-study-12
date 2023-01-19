package LEESEUNGRYEOL.report3;
//4-9 문제
public class Report3_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        int a =1,b =1;

        while (a != 0)
        {
            a = num / 10;
            b = num % 10;
            sum = sum +b;
            num = a;
        }

        System.out.println("sum="+sum);
    }
}
