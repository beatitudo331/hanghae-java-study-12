package kimwooyeong.report8;
// 7-1번 문제
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i = 0; i < cards.length / 2; i++) {
            int b = i + 1;
            cards[i] = new SutdaCard(b, toString().isEmpty());
        }
        for (int i = 0; i < cards.length / 2; i++) {
            int b = i + 1;
            if (i == 0 || i == 2 || i == 7) {
                cards[10 + i] = new SutdaCard(b, false);
            } else {
                cards[10 + i] = new SutdaCard(b, toString().isEmpty());
            }

        }
    }



    void shuffle() {
        // (구현)
        int a;
        SutdaCard temp;
        for (int i = 0; i < 100; i++) {
            a = (int)(Math.random()* cards.length);
            temp = cards[0];
            cards[0] = cards[a];
            cards[a] = temp;

        }
    }

    SutdaCard pick(int index) {
        // (구현)
        return cards[index];
    }

    SutdaCard pick() {
        // (구현)
        int a = (int)(Math.random()* cards.length);
        return cards[a];
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
//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){
        // 기본 생성자를 만들어주면 된다.
    }

    Product(int price) {
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


class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > MIN_CHANNEL && volume < MAX_CHANNEL){
            return;
        }
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MIN_VOLUME && volume < MAX_VOLUME){
            return;
        }
        this.volume = volume;
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

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    private int temp;
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

        // (구현)
        temp = this.channel; // temp 에다 10 입력
        this.channel = channel; // channel 에다 20 입력
        prevChannel = temp; // prevChannel 에다 10입력
    }

    public int getChannel() {
        return channel;
    }

    // (구현)
    public void gotoPrevChannel(){
        temp = channel; // temp 에다 20 입력
        channel = prevChannel; // channel 에다 10 입력
        prevChannel = temp; // prevChannel 에다 20입력

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