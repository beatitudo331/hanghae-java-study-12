package kimdonghyeon.report3;

//4-2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
public class Report3_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 20) {
            if (!(i % 2 == 0 && i % 3 == 1))
                sum += i;
            i++;
        }
        System.out.println("sum=" + sum);
    }
}
