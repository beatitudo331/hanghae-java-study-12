package yuyeongwoo.report8;
//문제 7-2번
public class report8_2 {
    public static void main(String[] args) {

    }
}

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            int a = i % 10 + 1;
            boolean b = i == 0 || i == 2 || i == 7;
            cards[i] = new SutdaCard2(a, b);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int a = (int) (Math.random() * cards.length);

            SutdaCard2 j = cards[i];
            cards[i] = cards[a];
            cards[a] = j;
        }
    }

    SutdaCard2 pick(int index) {
        return cards[index];
    }

    SutdaCard2 pick() {
        int a = (int) (Math.random() * cards.length);
        return cards[a];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    public SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard2() {
        this(1, true);
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

