//6-5. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.
class PlayingCard {
    int kind;
    int num;
    static int width;
    static int height;
    PlayingCard(int k, int n) {
        kind = k;
        num = n;
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}

정답 :

class PlayingCard {
    int kind;   // 인스턴스 변수 iv
    int num;    // 인스턴스 변수 iv
    static int width;   // 클래스 변수 cv
    static int height;  // 클래스 변수 cv
    PlayingCard(int k, int n) {
        kind = k;   // 지역변수 lv
        num = n;    // 지역변수 lv
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}