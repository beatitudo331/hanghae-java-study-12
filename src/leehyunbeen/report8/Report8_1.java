package leehyunbeen.report8;
// 7-1번 문제
public class Report8_1 {
    public static void main(String args[]) {
//        SutdaDeck deck = new SutdaDeck();
//        for(int i=0; i < deck.cards.length;i++) System.out.print(deck.cards[i]+",");
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            cards[i] = new SutdaCard(i + 1, false);
        }
        cards[0].isKwang = true;
        cards[2].isKwang = true;
        cards[7].isKwang = true;

    }

    void shuffle(){
        SutdaCard temp_card = new SutdaCard();
        for (int i=0; i<CARD_NUM;i++){
            int rand = (int)(Math.random()*20);
            temp_card = cards[i];
            cards[i] = cards[rand];
            cards[rand]=temp_card;

        }


    }

    SutdaCard pick(int index) {


        return cards[index];
    }

    SutdaCard pick() {

        return cards[(int)(Math.random()*20+1)];
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


//Exercise7_3 시작--------------------------------------------
// Product(int price) > Product() 로 변경하였다
//Tv(){}에서 부모 클래스의 값을 상속할때 자동으로 super();가 삽입되는데 이때 price값이 없음으로 진행이 안된다.


class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)

    Product() {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
    }

    public String toString() {
        return "Tv";
    }
}

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}


//Exercise7_4 시작--------------------------------------------
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)

    public void setChannel(int num){
        channel = num;
    }
    public void setVolume(int num){
        volume = num;
    }
    public int getChannel(){
        return channel;
    }
    public int getVolume(){
       return volume;
    }
}

class Exercise7_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20

//Exercise7_5 시작--------------------------------------------

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    // (구현)

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void gotoPrevChannel(){
        int temp = channel;
        channel=prevChannel;
        prevChannel = temp;
    }
}

class Exercise7_5 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

// CH:10
// CH:20
// CH:10
// CH:20



