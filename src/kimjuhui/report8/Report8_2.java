package kimjuhui.report8;

public class Report8_2 {
    public static void main(String args[]) {
        SutdaDeck2 deck = new SutdaDeck2();

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

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        // 연습문제 7-1 의 답이므로 내용생략
        for(int i = 0; i < CARD_NUM; i++) {
            if(i + 1 == 1 || i + 1 == 3 || i + 1 == 8) {
                cards[i] = new SutdaCard2(i + 1, true);
            } else {
                cards[i] = new SutdaCard2(i % 10 + 1, false);
            }
        }
    }

    void shuffle() {
        // (구현)
        SutdaCard2 temp;
        int index = 0;

        for(int i = 0; i < cards.length; i++) {
            index = (int)(Math.random() * cards.length);
            temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }

    SutdaCard2 pick(int index) {
        // (구현)
        if(index < 0 || index >= CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    SutdaCard2 pick() {
        // (구현)
        int index = (int)(Math.random() * cards.length);
        return pick(index);
    }
} // SutdaDeck

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

