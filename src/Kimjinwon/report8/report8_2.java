package Kimjinwon.report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // 연습문제 7-1 의 답이므로 내용생략
        for(int i=0; i<cards.length;i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle() {
        // (구현)
        for(int i=0; i<cards.length;i++){
            int idx = (int)(Math.random() * 20);
            SutdaCard tmp = cards[idx];
            cards[idx] = cards[i];
            cards[i] = tmp;
        }
    }

    SutdaCard pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard pick() {
        // (구현)
        int idx = (int)(Math.random() * cards.length);
        return cards[idx];
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

public class Report8_2 {
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