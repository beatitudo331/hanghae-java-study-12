//연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//메서드명 : shuffle
//기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//반환타입 : 없음
//매개변수 : 없음
//메서드명 : pick
//기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//반환타입 : SutdaCard
//매개변수 : int index - 위치
//메서드명 : pick
//기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//반환타입 : SutdaCard
//매개변수 : 없음
package report8;
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        cards[0] = new SutdaCard(1, true);
        cards[1] = new SutdaCard(2, false);
        cards[2] = new SutdaCard(3, true);
        cards[3] = new SutdaCard(4, false);
        cards[4] = new SutdaCard(5, false);
        cards[5] = new SutdaCard(6, false);
        cards[6] = new SutdaCard(7, false);
        cards[7] = new SutdaCard(8, true);
        cards[8] = new SutdaCard(9, false);
        cards[9] = new SutdaCard(10, false);
        cards[10] = new SutdaCard(1, false);
        cards[11] = new SutdaCard(2, false);
        cards[12] = new SutdaCard(3, false);
        cards[13] = new SutdaCard(4, false);
        cards[14] = new SutdaCard(5, false);
        cards[15] = new SutdaCard(6, false);
        cards[16] = new SutdaCard(7, false);
        cards[17] = new SutdaCard(8, false);
        cards[18] = new SutdaCard(9, false);
        cards[19] = new SutdaCard(10, false);

    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            SutdaCard tmp = new SutdaCard();
            tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int i = (int) (Math.random() * cards.length);
        return cards[i];
    }
} // SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2