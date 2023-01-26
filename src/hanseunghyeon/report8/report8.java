package hanseunghyeon.report8;

// 7-1.
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    
    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            SutdaCard card = new SutdaCard();
            card.num = i % 10 + 1;
            if(!(card.num == 1 || card.num == 3 || card.num == 8))
                card.isKwang = false;
            cards[i] = card;
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int num = (int)(Math.random() * cards.length);
            SutdaCard tmp = cards[i];

            cards[i] = cards[num];
            cards[num] = tmp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        int num = (int)(Math.random() * cards.length);
        return cards[num];
    }
}   // end pf SutdDeck class

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    
    public String toString() {
        return num+ (isKwang ? "K" : "");
    }
}   // end of SutdaCard

class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}   // end fo Exercise7_1


// 7-2. SutdaDeck 클래스는 위에서 수정.

class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

// 7-3. Product를 상속받은 Tv의 생성자에 내용이 없지만 자동적으로 조상의 기본 생성자를 호출하는 super(); 가 호출된다.
// 하지만 조상인 Product 클래스는 기본 생성자를 가지고 있지 않으므로 오류가 발생한다. 해결방법은 다음과 같다.
// 1. Product 클래스에 기본 생성자를 만든다.
// 2. Tv 클래스의 생성자가 super(int price) 생성자를 호출하게 변경한다.
// 개인적으로는 1번의 방법으로 변경하는 것이 좋다고 생각한다. 2번의 방법으로는 현재의 문제는 해결할 수 있지만 생성자를 만들때마다 설정을 해줘야 하기 때문이다.

// 1번
class Product {
    int price;
    int bonusPoint;

    Product(){
        this(100);
    }
    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {
    Tv() {

    }

    public String toString(){
        return "Tv";
    }
}

// 2번
class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}


class Product_1 {
    int price;
    int bonusPoint;

    Product_1(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv_1 extends Product_1 {
    Tv_1() {
        super(100);
    }

    public String toString(){
        return "Tv";
    }
}

class Exercise7_3_1 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

// 7-4.
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return channel;
    }
    public boolean getIsPowerOn() {
        return isPowerOn;
    }
    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel){
        if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL)
            this.channel = channel;
    }
    public void setIsPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
    public void setVolume(int volume){
        if(MIN_VOLUME <= volume && volume <= MAX_VOLUME)
            this.volume = volume;
    }
}

class Execise7_4 {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL : " + t.getVolume());
    }
}

// 7-5.

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return channel;
    }
    public boolean getIsPowerOn() {
        return isPowerOn;
    }
    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel){
        if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
            prevChannel = this.channel;
            this.channel = channel;
        }
    }
    public void setIsPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }
    public void setVolume(int volume){
        if(MIN_VOLUME <= volume && volume <= MAX_VOLUME)
            this.volume = volume;
    }

    void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}

class Execise7_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH : " + t.getChannel());
        t.setChannel(20);
        System.out.println("CH : " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : " + t.getChannel());
    }
}