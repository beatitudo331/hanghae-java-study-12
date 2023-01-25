package kimNahyun.report3;

// 4-4번 문제
public class Report3_4 {
    public static void main(String[] args) {
        int sum = 0; // 총합을 저장할 변수
        int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int num = 0;

        Loop1: for(num=1; ; num++){
            if(sum>=100){
                break Loop1;
            }
            if(num%2==0){
                sum +=(-num);
            } else{
                sum += num;
            }
        }

        System.out.println("num="+num);
        System.out.println("sum="+sum);
    }
}
