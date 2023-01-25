package LEESEUNGRYEOL.report8;

import java.util.Arrays;

class SutdaDeck1 {
    final int CARD_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

    SutdaDeck1() {

        boolean iskwang;
        int[] checklist = new int[3];

        for (int i = 0; i < CARD_NUM / 2; i++) {
            if (i + 1 == 1 || i + 1 == 3 || i + 1 == 8) {
                cards[i] = new SutdaCard1(i + 1, true);
            } else {
                cards[i] = new SutdaCard1(i + 1, false);
            }
        }


        for (int i = CARD_NUM / 2; i < CARD_NUM; i++) {
            if (i == 1 || i == 3 || i == 8) {
                cards[i] = new SutdaCard1(i - 9, false);
            } else {
                cards[i] = new SutdaCard1(i - 9, false);
            }
        }


    }

    void shuffle() {
        SutdaCard1 tmp;
        for (int i = 0; i < cards.length ; i++) {
            int random_num =(int) (Math.random()*cards.length);
            tmp = cards[i];
            cards[i] = cards[random_num];
            cards[random_num] = tmp;
//            System.out.println("random_num = " + random_num);
//            System.out.println(Arrays.toString(cards));
        }
    }

    SutdaCard1 pick(int index) {
        return cards[index];
    }

    SutdaCard1 pick() {
        int random_num =(int) (Math.random()*cards.length);
        return cards[random_num];
    }
} // SutdaDeck

class SutdaCard1 {
    int num;
    boolean isKwang;


    SutdaCard1() {
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck1 deck = new SutdaDeck1();

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