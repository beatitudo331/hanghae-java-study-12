package kimNahyun.report5;

//6-5번 문제
public class Report5_4 {
}

class PlayingCard {
    int kind;   // 인스턴스 변수
    int num;    // 인스턴스 변수
    static int width;   // 클래스 변수
    static int height;  // 클래스 변수
    PlayingCard(int k, int n) { // 매개변수
        kind = k;   // 지역변수
        num = n;    // 지역변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}