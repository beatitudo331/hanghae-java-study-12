package LeeJaeHun.Report8;
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i =0; i <cards.length  ; i++){
            if ( i<10 &&i+1 ==1 ||i+1==3||i+1==8){
                cards[i] = new SutdaCard(i+1, true);
            }else{
                cards[i] = new SutdaCard(i%10+1, false);
            }
        }
    }

    void shuffle() {
        // (구현)
        SutdaCard tmp ;

        for (int i = 0; i < cards.length; i++) {
            int randomNum = (int)(Math.random()*19)+1;
            tmp = cards[i];
            cards[i] = cards[randomNum];
            cards[randomNum] = tmp;
        }
    }

    SutdaCard pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard pick() {
        int randomNum = (int)(Math.random()*19)+1;
        return cards[randomNum];
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
public class Report8_2 {
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
