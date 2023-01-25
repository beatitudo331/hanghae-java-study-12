package LEESEUNGRYEOL.report3;
// 4-4 문제
public class Report3_4 {
    public static void main(String [] args)
    {
        int sum = 0;
        int s = 1;
        int num = 0;



        while (sum < 5)
        {
            num++;

            if(s == 1)
            {
                sum = sum + num;
            }
            else
            {
                sum = sum -num;
            }

            s = -s;
        }

        System.out.println("num = " + num);
        System.out.println("sum = " + sum);
    }

}
