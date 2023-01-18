package LEESEUNGRYEOL.report2;
// 3-4번 문제
public class Report2_4 {
    public static void main(String[] args){

        int numOfApples = 1432; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        Find_bucket find_bucket = new Find_bucket();
        find_bucket.result(numOfApples,sizeOfBucket);

    }
}

class Find_bucket{
    void result(int a, int b)
    {
        int numOfBucket = (a/b + 1); // 모든 사과를 담는데 필요한 바구니의 수

        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }

}