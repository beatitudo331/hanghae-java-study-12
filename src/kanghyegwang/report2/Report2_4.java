package studentenglishname.report2;
import java.util.Scanner;
// 3-4번 문제
public class Report2_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numOfApples = kb.nextInt();
        int sizeOfBucket = kb.nextInt();
        int numOfBucket = numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;

        System.out.println("필요한 바구니의 수 = " + numOfBucket);
    }
}