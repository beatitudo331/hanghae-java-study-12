package kimyuyoung.report2;

public class Report2_4 {

    //3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
    class Exercise3_4{
        public static void main(String[] args){
            int numOfApples = 123; // 사과의 개수
            int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
            int numOfBucket = (numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket>0?1:0)); // 모든 사과를 담는데 필요한 바구니의 수

            System.out.println("필요한 바구니의 수 :"+numOfBucket);
        }
    }
//예상 결과 -> 필요한 바구니의 수 :13
}
