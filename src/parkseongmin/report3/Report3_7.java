// 4-7번 문제
class Exercise4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        int num = Integer.parseInt(str);

        for (int i = 0; i < str.length(); i++) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("sum=" + sum);
    }
}