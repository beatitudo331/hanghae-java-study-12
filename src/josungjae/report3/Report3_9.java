package josungjae.report3;
//4-9번 문제
class Report3_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num%10;  // 10으로 나누고
            num /= 10;      // 10으로 나머지 연산
        }

        System.out.println("sum="+sum);
    }
} //예상결과 : sum=15
