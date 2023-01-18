package yuyeongwoo.report2;
// 3-4번 문제
public class Report2_4 {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;
        //정답
        int numOfbucket = numOfApples / sizeOfBucket + (numOfApples % 10 > 0 ? 1 : 0);
        System.out.println("필요한 바구니의 수 : " + numOfbucket);
    }
}
