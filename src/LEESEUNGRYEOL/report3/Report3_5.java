package LEESEUNGRYEOL.report3;
// 4-5 문제
public class Report3_5 {
    public static void main(String args[])
    {
        int i = 0 ,j = 0;

        while (i < 10)
        {
            while(j <= i)
            {
                System.out.print('*');
                j++;
            }
            i++;
            j = 0;
            System.out.println();
        }
    }
}
