package kimdonghyeon.report8;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck2() {
        for (int i = 1; i <= CARD_NUM; i++)
            if (i == 1 || i == 3 || i == 8) this.cards[i - 1] = new SutdaCard(i, true);
            else this.cards[i - 1] = new SutdaCard(i, false);
    }

    void shuffle() {
        int randomNum = (int) ((float) Math.random() * CARD_NUM);
        SutdaCard tempDeck;
        for (int i = 0; i < CARD_NUM; i++) {
            tempDeck = this.cards[i];
            this.cards[i] = this.cards[randomNum];
            this.cards[randomNum] = tempDeck;
        }
    }

    SutdaCard pick(int index) {
        // (구현)
        return this.cards[index];
    }

    SutdaCard pick() {
        int randomNum = (int) ((float) Math.random() * CARD_NUM);
        // (구현)
        return this.cards[randomNum];
    }
}

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

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Report8_2 {
    /*
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }*/
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
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,