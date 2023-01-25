package wooramhong.report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            cards[i]=new SutdaCard();
            cards[i].num = i%10+1;
            cards[i].isKwang=(i<10) && ((i==0) || (i==2) || (i==7))? true:false;
        }
    }
    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j= (int)(Math.random()* cards.length);
            int tem = 0;

            tem = cards[i].num;
            cards[i].num=cards[j].num;
            cards[j].num=tem;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }
    SutdaCard pick() {
        int random =(int)(Math.random()*cards.length);
        return cards[random];
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
//8-1
//class Exercise7_1 {
//    public static void main(String args[]) {
//        SutdaDeck deck = new SutdaDeck();
//
//        for (int i = 0; i < deck.cards.length; i++)
//            System.out.print(deck.cards[i] + ",");
//    }
//}

//8-2
//    class Exercise7_2 {
//        public static void main(String args[]) {
//            SutdaDeck deck = new SutdaDeck();
//
//            System.out.println(deck.pick(0));
//            System.out.println(deck.pick());
//            deck.shuffle();
//
//            for(int i=0; i < deck.cards.length;i++)
//                System.out.print(deck.cards[i]+",");
//
//            System.out.println();
//            System.out.println(deck.pick(0));
//        }
//    }


//8-3
//class Product {
//    int price; // 제품의 가격
//    int bonusPoint; // 제품구매 시 제공하는 보너스점수
//
//    Product(){}
//
//    Product(int price) {
//        this.price = price;
//        bonusPoint = (int) (price / 10.0);
//    }
//}
//
//class Tv extends Product {
//    Tv() {
//    }
//
//    public String toString() {
//        return "Tv";
//    }
//}
//
//class Exercise7_3 {
//    public static void main(String[] args) {
//        Tv t = new Tv();
//    }
//}

//8-4
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    private int prevChannel2;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    int getChannel(){
        return channel;
    }
    int getVolume(){
        return volume;
    }
    void setChannel(int num){
        prevChannel=channel;
        if(num>=MIN_CHANNEL && MAX_CHANNEL>num){
            channel=num;
        }
    }
    void setVolume(int num){
        if(num>=MIN_VOLUME && MAX_VOLUME>num){
            volume=num;
        }
    }
    void gotoPrevChannel(){
        prevChannel2=channel;
        channel=prevChannel;
        prevChannel=prevChannel2;
    }
}

//8-4
//class Exercise7_4 {
//    public static void main(String args[]) {
//        MyTv t = new MyTv();
//
//        t.setChannel(10);
//        System.out.println("CH:" + t.getChannel());
//        t.setVolume(20);
//        System.out.println("VOL:" + t.getVolume());
//    }
//}

//8-5
//class Exercise7_5 {
//    public static void main(String args[]) {
//        MyTv t = new MyTv();
//        t.setChannel(10);
//        System.out.println("CH:" + t.getChannel());
//        t.setChannel(20);
//        System.out.println("CH:" + t.getChannel());
//        t.gotoPrevChannel();
//        System.out.println("CH:" + t.getChannel());
//        t.gotoPrevChannel();
//        System.out.println("CH:" + t.getChannel());
//    }
//}
