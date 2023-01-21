package koyoungjin.report3;
// 4-2 문제
// 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
public class Report3_2 {
    public static void main(String[] args) {
        int sum = 0;

        // 1부터 20까지의 정수니까 a=1; a<=20; 까지 반복돌림
        for(int a=1;a<=20;a++){
            //2의 배수가 아닐 때 && 3의 배수가 아닐 때
            if(a % 2 != 0 && a % 3 != 0){
                //아닐때만 더해줌
                sum = sum+a;
            }
        }

        System.out.println("sum = " + sum);
    }
}
