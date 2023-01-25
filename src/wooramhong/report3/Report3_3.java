package wooramhong.report3;

class Report3_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                sum+=j;
            }
            totalSum+=sum;
        }
        System.out.println("totalSum="+totalSum);
    }
}
