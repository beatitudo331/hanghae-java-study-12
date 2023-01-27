//4-4. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때,
//몇까지 더해야 총합이 100 이상이 되는지 구하세요.
package LeeJaeHun.Report3;

//4-9. int 타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하세요.
//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하세요.
//문자열로 변환하지 말고 숫자로만 처리하세요.
class Report3_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num > 0){
            sum += num %10;
            num /= 10;
        }
        System.out.println("sum="+sum);
    }
}