package jeondabeen.report3;

public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        while (sum < 100) {
            if (num != 0 && num % 2 == 0) {
                s = 1;
            } else if (num % 2 != 0) {
                s = -1;
            }

            num = (Math.abs(num) + 1) * s;
            sum += num;
        }
        System.out.println();
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
