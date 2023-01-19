package studentenglishname.report3;


//4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.
public class Exercise4_3_1 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        /*빈 칸*/
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++) {
                System.out.println("----start----");
                System.out.println("sum: "+sum);
                System.out.println("j:"+j);
                sum+=j;
                System.out.println("sum+j:"+sum);
            }
            System.out.println("----endloop---------");
        }
        System.out.println("totalSum="+totalSum);
    }
}
