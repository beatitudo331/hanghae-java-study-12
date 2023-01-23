package jominsung.report5;

public class Report5_4 {
    public static void main(String[] args) {
        //6-5. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.


    }
}
class PlayingCard {
    //인스턴스 변수
    int kind;
    int num;

    //클래스 변수
    static int width;
    static int height;
    PlayingCard(int k, int n) {
        //지역변수
        kind = k;
        num = n;
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}