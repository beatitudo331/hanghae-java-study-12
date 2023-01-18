package koyoungjin.report2.koyoungjin.report2;
// 3-4번 문제
public class Report2_4 {
        public static void main(String[] args){

            int numOfApples = 123; // 사과의 개수
            int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
            int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket> 0 ? 1 : 0); // 모든 사과를 담는데 필요한 바구니의 수
            System.out.println("필요한 바구니의 수 :"+numOfBucket);
        }
        //예상 결과 -> 필요한 바구니의 수 :13
        /*
        사과의 개수/바구니의 크기 = 바구니 12개
        사과의 개수%바구니의 크기 = 나머지 3 / 나머지가 3이라는 얘기는 바구니가 하나 더 필요하단 얘기니까
        삼항연산자 ?를 이용해 나머지가 1이상 나오면 (바구니가 1개 더 필요하기 때문에)1을 반환. (나머지가 없을 경우는 필요가 없기 때문에 0)
         */
}
