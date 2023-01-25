package LEESEUNGRYEOL.report2;
// 3-3번 문제
public class Report2_3 {
    public static void main(String[] args) {
        Find_num findNum = new Find_num();
        int num = 456;
        findNum.result(num);
    }
}

class Find_num{
    void result(int num)
    {
        int remainder = num % 100;
        int result = num - remainder;
        System.out.println(result);
    }
}
