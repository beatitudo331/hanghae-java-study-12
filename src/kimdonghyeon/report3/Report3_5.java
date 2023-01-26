package kimdonghyeon.report3;

//4-5. 다음의 for문을 while문으로 변경하세요.
public class Report3_5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (true) {
            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            i++;
            if (i == 10)
                break;
            System.out.println();
        }
    }
}
