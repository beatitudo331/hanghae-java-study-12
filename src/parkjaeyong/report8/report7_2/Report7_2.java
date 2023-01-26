package parkjaeyong.report8.report7_2;

/**
 메서드명 : shuffle
 기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
 반환타입 : 없음
 매개변수 : 없음

 메서드명 : pick
 기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
 반환타입 : SutdaCard
 매개변수 : int index - 위치

 메서드명 : pick
 기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
 반환타입 : SutdaCard
 매개변수 : 없음
 */

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i = 0 ; i < CARD_NUM ; i++){
            int num = i % 10 + 1;
            boolean isKang = (i / 10 == 0) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num,isKang);
        }
    }

    void shuffle() {
        // (구현)
        for(int i = 0 ; i < CARD_NUM ; i++){
            int idx = (int)(Math.random() * CARD_NUM);
            SutdaCard tmp = cards[0];
            cards[0] = cards[idx];
            cards[idx] = tmp;
        }
    }

    SutdaCard pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard pick() {
        // (구현)
        int idx = (int) (Math.random() * CARD_NUM);
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

class Report7_2 {
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
// 결과
//  1K
//  8K
//  9,7,8,7,5,6,9,1,4,10,3,2,4,10,5,6,3K,8K,1K,2,
//  9

//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2