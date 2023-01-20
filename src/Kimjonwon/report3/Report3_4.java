package Kimjonwon.report3;

public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;
        int i = 1;

        while(sum <= 100){
            if(i%2==0)
                num = num + (i * (-s));
            else
                num+=i;
            i++;
            sum += num;
        }
        num = i;
        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}