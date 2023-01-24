package ohseyoung.report8;

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        // 연습문제 7-1 의 답이므로 내용생략
    }


    void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            int random_num = (int) (Math.random() * cards.length);
            SutdaCard2 tmp = cards[i];
            cards[i] = cards[random_num];
            cards[random_num]=tmp;
        }
    }
    SutdaCard2 pick(int index){
        return cards[index];
    }
    SutdaCard2 pick(){
        int random_num = (int) (Math.random() * cards.length);

        return cards[random_num];
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
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2