package HongYeSeok.report3;

// 4-4번 문제
// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하세요.
public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        while (sum<100){
            num++;
            if(num % 2 == 1){
                sum+=num;
            } else {
                sum+= (-1 * num);
            }
        }
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
