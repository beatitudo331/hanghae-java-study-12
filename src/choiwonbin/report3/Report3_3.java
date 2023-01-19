package choiwonbin.report3;

//4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하세요.
class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            System.out.println();
            totalSum += sum;
            sum = 0;
        }
        System.out.println("totalSum="+totalSum);
    }
}