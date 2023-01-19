package LEESEUNGRYEOL.report3;
// 4-3 문제
public class Report3_3 {
    public static void  main(String [] args)
    {
        int sum = 0;
        int totalSum = 0;
        
        for (int i = 1; i < 6 ; i++) {
           
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            
            totalSum += sum;
            sum = 0;
        }

        System.out.println("totalSum = " + totalSum);
    }
}
