package jominsung.report3;

public class Report3_2 {
    public static void main(String[] args) {
        //4-2. 1부터 20까지의 정수중에서 2 또는 3의 배수가 아닌 수의 총합을 구하세요.
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0)
                continue;
            sum += i;
            System.out.println("sum=" + sum);
        }
    }
}

