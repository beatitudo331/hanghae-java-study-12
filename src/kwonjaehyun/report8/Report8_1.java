package kwonjaehyun.report8;
// 7-1번 문제
//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        int j = 0;
        int count=1;
        for (int i = 0; i < CARD_NUM; i++) {
            if (j==10)
            {j=0;}

            if (j+1==3||j+1==1||j+1==8){
                if (count <4){
                cards[i] = new SutdaCard(j+1,true);
                count++;
                }
                else {
                    cards[i] = new SutdaCard(j + 1, false);
                }
            }else {
                cards[i] = new SutdaCard(j + 1, false);
            }
            j++;
        }
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
    }
    // 여기서부터 7-2번 문제
    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        return cards[(int)(Math.random()*CARD_NUM)];
    }
    void shuffle(){
     SutdaCard tmp = new SutdaCard();
     int rand;
        for (int i = 0; i < CARD_NUM*3; i++) {
            rand = (int)(Math.random()*CARD_NUM);
            tmp = cards[0];
            cards[0] = cards[rand];
            cards[rand]= tmp;
        }
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

public class Report8_1 {

    public static void main(String args[]) {
         SutdaDeck deck = new SutdaDeck();
//
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,