package kimNahyun.report8;
// 7-2 번 문제

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i=0; i<cards.length; i++){
            if(i==0||i==2||i==7){
                cards[i]=new SutdaCard(i+1,true);
            }else {
                cards[i]=new SutdaCard(i%10+1,false);
            }
        }
    }

    void shuffle() {
        for(int i =0; i<cards.length; i++){
            int j = (int)(Math.random()*CARD_NUM);
            SutdaCard temp = cards[i];
            //왜 굳이 클래스 자료형으로 줘야하지
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    SutdaCard pick(int index) {

        return cards[index];
    }

    SutdaCard pick() {
        int index = (int)(Math.random()*CARD_NUM);
        return cards[index];
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

//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2
