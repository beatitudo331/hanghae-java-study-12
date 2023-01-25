package LeeGeonHo.report8;

//문제 7-1 , 7-2
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//    섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//    섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//    단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//    즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10+1;
            boolean iskwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, iskwang);
        }
    }

    //7-2. 연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오
    void shuffle(){
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < (int)(Math.random()*cards.length); j++) {
                SutdaCard tmp ;
                tmp = cards[i];
                cards[i] = cards[j];
                cards[j] = tmp;
            }

        }

    }
    SutdaCard pick(int index){
        if(index<0 || index>= cards.length){
            return null;
        }
        return cards[index];

    }
    SutdaCard pick(){
        int idx = (int)(Math.random()* cards.length);
        return cards[idx];
    }

}
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.

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

public class Report8_1 {
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
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,