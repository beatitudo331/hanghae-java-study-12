package kimjeongkyu.report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];


    //  start : 7-1
    // 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
    // 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
    // 단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
    // 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i = 0; i < CARD_NUM; i++) {
            int tmp = i % 10 + 1;
            if ((tmp == 1 || tmp == 3 || tmp == 8) && i < 10) {
                cards[i] = new SutdaCard(tmp, true);
            }else{
                cards[i] = new SutdaCard(tmp, false);
            }
        }
    }
    // end : 7-1

    // start : 7-2

    /**
     * shuffle
     * 배열 cards에 담긴 카드의 위치를 뒤섞는다. -> Math.random()
     * 반환타입 : 없음
     * 매개변수 : 없음
     */
    void shuffle() {
        for (int i = 0; i < this.cards.length/2; i++) {
            int r = (int)(Math.random() * CARD_NUM);
            SutdaCard tmp = this.cards[r];
            this.cards[r] = this.cards[i];
            this.cards[i] = tmp;
        }
    }

    /**
     * pick
     * 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
     * 반환타입 : SutdaCard
     * 매개변수 : int index - 위치
     */
    SutdaCard pick(int index) {
        return this.cards[index];
    }

    /**
     * pick
     * 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
     * 반환타입 : SutdaCard
     * 매개변수 : 없음
     */
    SutdaCard pick() {
        int r  = (int) (Math.random() * CARD_NUM);
        return this.cards[r];
    }
    // end : 7-2
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