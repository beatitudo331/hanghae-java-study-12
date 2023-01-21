package koyoungjin.report3;
// 4-4 문제
// 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
// 몇까지 더해야 총합이 100 이상이 되는지 구하세요.
public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        // 총합 100까지니까 sum이 100이 되기전까지(99)까지 돌리고 마지막에 i++해서 100됨
        // 돌때마다 s=-s 되서 +1 -1 계속 반복
        for (int i=1; sum<100; i++, s=-s){
            //num에 계속 더해나감
            num = s * i;
            //num구한거 sum에 더함
            sum = sum + num;
        }

        // sum 은 100까지 돌렸으니까 100
        // num = 199
        System.out.println("num=" + num);
        System.out.println("sum=" + sum);
    }
}
