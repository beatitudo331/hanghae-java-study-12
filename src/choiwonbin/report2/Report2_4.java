package choiwonbin.report2;
//  3-4 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드
//  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것
//  알맞은 코드를 넣으시오.
public class Report2_4 {
    public static void main(String[] args) {
        int numOfApples =200;   //  사과의 개수
        int sizeOfbucket = 10;  //  바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfbucket = (numOfApples/sizeOfbucket)+1;
                System.out.println(numOfbucket);
    }
}
