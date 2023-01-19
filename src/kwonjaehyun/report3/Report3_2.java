package kwonjaehyun.report3;
//4-2번 문제
public class Report3_2 {
    //1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0;i<20;i++){
            if(!(i%2 ==0||i%3==0)){
            sum = sum+i;
            }
        }
        System.out.println("sum="+sum);
    }
}
