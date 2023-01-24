package kanghyegwang.report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i%10 + 1;
            boolean isKang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKang);
        }
    }
}

class SutdaCard {
    int num;
    boolean isKang;

    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKang) {
        this.num = num;
        this.isKang = isKang;
    }

    public String toString() {
        return num + (isKang ? "K" : "");
    }
}

public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}
