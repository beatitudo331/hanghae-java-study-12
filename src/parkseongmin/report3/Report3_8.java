// 4-8번 문제
class Exercise4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num /= 10;
        }

        System.out.println("sum="+sum);
    }
}
