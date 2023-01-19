package studentenglishname.report2;

class Exercise3_4{
    public static void main(String[] args){
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = (int)(Math.ceil(numOfApples/(double)sizeOfBucket));

        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }
}
