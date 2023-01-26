package Leesanghoon.report8;
// 7-2번 문제
class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for(int i = 0; i < CARD_NUM; i++) {
            int num = (i % 10) + 1;
            boolean isKwang =  false;
            if ((i < 10) && ((num == 1) || (num == 3) || (num ==8)))
                isKwang = true;
            cards[i] = new SutdaCard2(num, isKwang);
        }
    }
    void shuffle() {
        for(int i = 0; i < cards.length; i++) {
            int random = (int)(Math.random() * 20);
            SutdaCard2 temp;
            temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }

    SutdaCard2 pick(int index) {
        return cards[0];
    }

    SutdaCard2 pick() {
        int random = (int)(Math.random()*20);
        return cards[random];
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

class Exercise7_2 {
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