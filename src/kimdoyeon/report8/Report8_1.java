package kimdoyeon.report8;
// 7-1 번 문제
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1;
            if (i < 10 && (num == 1 || num == 3 || num == 8))
                cards[i] = new SutdaCard(num, true);
            else
                cards[i] = new SutdaCard(num, false);
        }
    }

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int j = (int)(Math.random() * CARD_NUM);
            SutdaCard tmp = cards[j];
            cards[j] = cards[i];
            cards[i] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
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
        return num + ( isKwang ? "K":"");
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