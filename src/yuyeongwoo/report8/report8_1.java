package yuyeongwoo.report8;
//문제 7-1번
public class report8_1 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();
        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int a = i % 10 + 1;
            boolean b = i == 0 || i == 2 || i == 7;
            cards[i] = new SutdaCard2(a, b);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard() {
        this(1, true);
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
