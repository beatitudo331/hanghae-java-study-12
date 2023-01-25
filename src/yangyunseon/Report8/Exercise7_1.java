package yangyunseon.Report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int n = (i % 10) + 1;
            boolean k = false;
            if (i == 0 || i == 2 || i == 7)
                k = true;
            cards[i] = new SutdaCard(n, k);
        }
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
    }

    void shuffle() {

        SutdaCard temp;
        for (int i = 0; i < CARD_NUM; i++) {
            int random = (int) (Math.random() * CARD_NUM);
            temp = cards[i];
            cards[i] = cards[random];
            cards[random] = temp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return cards[index];
    }
}

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

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,


class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2