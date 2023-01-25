package report8;

//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        cards[0] = new SutdaCard(1, true);
        cards[1] = new SutdaCard(2, false);
        cards[2] = new SutdaCard(3, true);
        cards[3] = new SutdaCard(4, false);
        cards[4] = new SutdaCard(5, false);
        cards[5] = new SutdaCard(6, false);
        cards[6] = new SutdaCard(7, false);
        cards[7] = new SutdaCard(8, true);
        cards[8] = new SutdaCard(9, false);
        cards[9] = new SutdaCard(10, false);
        cards[10] = new SutdaCard(1, false);
        cards[11] = new SutdaCard(2, false);
        cards[12] = new SutdaCard(3, false);
        cards[13] = new SutdaCard(4, false);
        cards[14] = new SutdaCard(5, false);
        cards[15] = new SutdaCard(6, false);
        cards[16] = new SutdaCard(7, false);
        cards[17] = new SutdaCard(8, false);
        cards[18] = new SutdaCard(9, false);
        cards[19] = new SutdaCard(10, false);

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