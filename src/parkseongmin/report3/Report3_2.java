// 4-2번 문제
class Exercise4_2_1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0){
                sum += i;
            }
        }
        System.out.println("sum=" + sum);
    }
}

//            다른 정답
class Exercise4_2_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0){
                continue;
            } sum += i;
        }
        System.out.println("sum=" + sum);
    }
}