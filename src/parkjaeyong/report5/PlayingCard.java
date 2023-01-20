package parkjaeyong.report5;

//6-4. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.
public class PlayingCard{
    int kind; // 인스턴스 변수
    int num; // 인스턴스 변수
    static int width; // 클래스 변수
    static int height; // 클래스 변수

    PlayingCard(int kind, int num) { // kind , num : 지역변수
        this.kind = kind; // 인스턴스 변수 = 지역변수
        this.num = num; // 인스턴스 변수 = 지역변수
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }
}