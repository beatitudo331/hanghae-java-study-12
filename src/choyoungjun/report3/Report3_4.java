package choyoungjun.report3;

public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int num = 1;
        while (true){
            if (num%2==0) sum -= num;
            else sum += num;
            if (sum>=100) break;
            num++;
        }
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
