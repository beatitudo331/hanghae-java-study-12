package wooramhong.report3;

class Report3_6 {
    public static void main(String[] args) {
        int[] dice1={1,2,3,4,5,6};
        int[] dice2={1,2,3,4,5,6};

        for (int i = 0; i < dice1.length; i++) {
            for (int j = 0; j < dice2.length; j++) {
                int sum=dice1[i]+dice2[j];
                if (sum==6) {
                    System.out.println("첫번쨰 주사위"+dice1[i]+"와 두번째 주사위"+dice2[j]);
                }
            }
        }
    }
}
