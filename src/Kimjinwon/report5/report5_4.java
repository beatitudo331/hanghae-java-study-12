package Kimjinwon.report5;

class PlayingCard {
    int kind;   // 인스턴스 변수
    int num;    // 인스턴스 변수
    static int width;   // 클래스 변수
    static int height;  // 클래스 변수
    PlayingCard(int k, int n) {
        kind = k;  // k = 지역 변수
        num = n;   // n 지역 변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
    // card = 지역 변수
    // args = 지역 변수