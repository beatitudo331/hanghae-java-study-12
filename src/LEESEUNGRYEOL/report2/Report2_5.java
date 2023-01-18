package LEESEUNGRYEOL.report2;
// 3-5번
public class Report2_5 {
    public static void main(String[] args) {
        int num = 10;
        Num_Category num_category = new Num_Category();
        num_category.print_category(num);
    }
}

class Num_Category{
    void print_category(int num)
    {
        String result;
        result = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
        System.out.println(result);
    }
}