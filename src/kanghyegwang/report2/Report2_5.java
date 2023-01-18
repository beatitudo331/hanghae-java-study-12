package studentenglishname.report2;
import java.util.Scanner;
// 3-5번 문제
public class Report2_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : 0));
    }
}