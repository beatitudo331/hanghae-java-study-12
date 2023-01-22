// 4-6번 문제
class Exercise4_6 {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5,6};
        for (int i = 0; i < num.length;) {
            for (int k : num) {
                if (num[i] + k != 6) {
                    continue;
                }
                System.out.print(num[i] + ",");
                System.out.println(k);
            }
            i++;
        }
    }
}