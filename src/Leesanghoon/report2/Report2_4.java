package Leesanghoon.report2;
// 3-4 문제
public class Report2_4 {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = (numOfApples/sizeOfBucket + (numOfApples% sizeOfBucket == 0 ? 0: 1));

        System.out.println("필요한 바구니의 수 : " +numOfBucket);
    }
}
