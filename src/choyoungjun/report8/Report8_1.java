package choyoungjun.report8;
//7-1.
//        섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//        섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//        단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//        즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i=0; i<CARD_NUM; i++){
            cards[i] = new SutdaCard();
            cards[i].setNum(i%10+1);
            if (!((i < 10)&&(cards[i].num==1||cards[i].num==3||cards[i].num==8))) cards[i].setKwang(false);
        }// getter와 setter를 만들어 주었지만, 만들지 말라는 조건이 있을 경우 그냥 num, isKwang값을 넣어준다.
    }

    public void shuffle(){
        for (int i=0; i<20; i++){
            int rand = (int)(Math.random()*CARD_NUM)+1;
            SutdaCard tmp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = tmp;
        }
    }
    public SutdaCard pick(int idx) throws Exception {
        if (idx<0 || CARD_NUM<=idx) throw new Exception("19 이하의 숫자를 골라주세요");
        return cards[idx];
    }
    //오버로딩의 어노테이션은 없다.
    public SutdaCard pick(){
        return cards[(int)(Math.random()*CARD_NUM)];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isKwang() {
        return isKwang;
    }

    public void setKwang(boolean kwang) {
        isKwang = kwang;
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

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,