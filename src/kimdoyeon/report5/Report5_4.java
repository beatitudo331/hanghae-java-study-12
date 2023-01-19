package kimdoyeon.report5;
// 6-4 번 문제
class PlayingCard {
    int kind;           // 인스턴스 변수
    int num;            // 인스턴스 변수
    static int width;   // 클래스 변수
    static int height;  // 클래스 변수
    PlayingCard(int k, int n) { // k, n 지역 변수
        kind = k;       // kind 인스턴스 변수
        num = n;        // num 인스턴스 변수
    }
    public static void main(String args[]) {            // args[] 지역변수
        PlayingCard card = new PlayingCard(1,1);    // card 지역변수
    }
}
