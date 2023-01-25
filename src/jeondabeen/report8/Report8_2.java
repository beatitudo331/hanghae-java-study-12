package jeondabeen.report8;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            if (i >= 10) {
                boolean isKwang = false;

                if (i == 10 || i == 12 || i == 17) isKwang = !(cards[i - 10].isKwang);

                cards[i] = new SutdaCard2(i + 1 - 10, isKwang);
            } else {
                boolean isKwang = false;

                if (i == 0 || i == 2 || i == 7) isKwang = (int) (Math.random() * 2) != 0;

                cards[i] = new SutdaCard2(i + 1, isKwang);
            }
        }
    }

    void shuffle() {
        // (구현)
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);

            SutdaCard2 tmp = new SutdaCard2();
            tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard2 pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard2 pick() {
        // (구현)
        int index = (int) (Math.random() * cards.length);
        return cards[index];
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

class Report8_2 {
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
