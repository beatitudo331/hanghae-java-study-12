package Leesanghoon.report3;

public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int num = ch - '0';
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
