package Kang_minkyu.report3;

//3-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100 이상이 되는지 구하세요.
public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;

        while (true) {
            num++;
            if (num % 2 == 0) {
                sum -= num;
            } else {
                sum += num;
            }
            if (sum >= 100) {
                break;
            }
        }
        System.out.println(num);
    }
}
