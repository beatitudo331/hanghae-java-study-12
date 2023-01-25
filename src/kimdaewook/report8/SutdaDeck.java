package kimdaewook.report8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i = 0; i < CARD_NUM; i++) {
            this.cards[i] = new SutdaCard(i+1 < 11 ? i+1 : i+1-10, false);
            if(i < 10 && (cards[i].num == 1 || cards[i].num == 3 || cards[i].num == 8)) {
                cards[i].isKwang = true;
            }
        }
    }

    void shuffle() {
        // (구현)
        List<SutdaCard> list = Arrays.asList(this.cards);
        Collections.shuffle(list);
        for(int i = 0; i < list.size(); i++) {
            this.cards[i] = list.get(i);
        }
    }

    SutdaCard pick(int index) {
        // (구현)

        return this.cards[index];
    }

    SutdaCard pick() {
        // (구현)
        int random = (int)(Math.random()*20) + 1;
        return this.cards[random];
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
        System.out.println();

//        deck.shuffle();
//
//        for (int i = 0; i < deck.cards.length; i++)
//            System.out.print(deck.cards[i] + ",");

        System.out.println();

        System.out.println(deck.pick());

    }
}
