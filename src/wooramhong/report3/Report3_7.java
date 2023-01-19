package wooramhong.report3;

class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char[] chArr = str.toCharArray();
            sum+=(int)chArr[i]-48;
        }

        System.out.println("sum=" + sum);
    }
}
