package hanjiyoon.report5;

//6-4. 다음의 코드에 정의된 변수들을 종류별(클래스 변수, 인스턴스 변수, 지역변수)로 구분해서 적으세요.
class PlayingCard {
    int kind;                               // 인스턴스 변수
    int num;                                // 인스턴스 변수
    static int width;                       // 클래스 변수
    static int height;                      // 클래스 변수
    PlayingCard(int k, int n) {
        kind = k;                           // 지역 변수
        num = n;                            // 지역 변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}