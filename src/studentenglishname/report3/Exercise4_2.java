package studentenglishname.report3;

//4-2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            //System.out.println(i+" sum start");
            if (i % 2 == 0 || i % 3 == 0)
                continue;
            sum = i + sum;
            //System.out.println("sum=" + sum);
        }
        System.out.println("sum:"+sum);
    }
}