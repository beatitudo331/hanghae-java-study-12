package leeDoGyeong.report3;

public class Report3_2 {

    //4-2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.

    public static void main(String[] args) {
        int sum = 0;

        int num = 1;
        for(int i = 0; i < 20; i++){
            if(num % 2 == 0 || num % 3 == 0){
                sum += num;
            }
            num++;
        }

        System.out.println("sum=" + sum);
    }


}
