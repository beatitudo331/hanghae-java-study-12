package leejingyu;

public class Report8 {
    class SutdaDeck {
        final int CARD_NUM = 20;
        SutdaCard[] cards = new SutdaCard[CARD_NUM];

        SutdaDeck() {
            for(int i=0; i<cards.length; i++){
                int num = i%10+1;
                boolean isKwang = (i<10)&&(num==1||num==3||num==8);
                cards[i] = new SutdaCard(num, isKwang);
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
            // System.out.println("here");
            return num + ( isKwang ? "K":"");

        }
    }
//
    class Exercise7_1 {
        public static void main(String args[]) {
            SutdaDeck deck = new SutdaDeck();

            for (int i = 0; i < deck.cards.length; i++)
                System.out.print(deck.cards[i].toString() + ",");
        }
    }
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i=0; i<cards.length; i++){
            int num = i%10+1;
            boolean isKwang = (i<10)&&(num==1||num==3||num==8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle() {
        // (구현)

        for (int i =0; i<cards.length;i++){
            int j = (int)(Math.random()*cards.length);
            SutdaCard tmp = cards[i]; //참조변수,
            cards[i] = cards[j]; //다른 객체에 접근할 때 쓰는 변수 앞에 클래스 명 붙이기
            cards[j] = tmp;

        }
    }

    SutdaCard pick(int index) { //객체 반환 메소드
        if(index<0||index>=CARD_NUM){
            return null;
        }
        return cards[index];

    }

    SutdaCard pick() {  //객체를 반환
        // (구현)
        int index= (int)(Math.random()* cards.length);
        return pick(index);
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
        //object 클래스의 주요 메소드 toString()과 equals() 오버라이딩이 어째서??
        public String toString() { //오버로딩이 어떻게 되는 것
            return num + ( isKwang ? "K":"");
        }
    }

    class Exercise7_2 {
        public static void main(String args[]) {
            SutdaDeck deck = new SutdaDeck();

            System.out.println(deck.pick(0)); //객체반환 메소드는 new가 필요x
            System.out.println(deck.pick()); //객체반환 메소드는 new가 필요x
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
        Product(){}
        Product(int price) {
            this.price = price;
            bonusPoint = (int) (price / 10.0);
        }
    }

    class Tv extends Product {
        Tv() {}

        public String toString() {
            return "Tv";
        }
    }

    class Exercise7_3 {
        public static void main(String[] args) {
            Tv t = new Tv();
        }
    }
// Tv(){}에서 Prdouct(){}를 호출하는 데 기본 생성자가 정의되어 있지 않으므로

    class MyTv {
        private boolean isPowerOn;
        private int channel;
        private int volume;

        final int MAX_VOLUME = 100;
        final int MIN_VOLUME = 0;
        final int MAX_CHANNEL = 100;
        final int MIN_CHANNEL = 1;

        // (구현)
        void setChannel(int channel){
            if(channel>MAX_CHANNEL || channel<MIN_CHANNEL){
                return;
            }
            this.channel = channel;
        }
        void setVolume(int volume){
            if(volume>MAX_VOLUME || volume<MIN_VOLUME){
                return;
            }
            this.volume = volume;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolume() {
            return volume;
        }
        void
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

            this.prevChannel = this.channel;
            this.channel = channel;
        }

        public int getChannel() {
            return channel;
        }

        public void gotoPrevChannel(){
            setChannel(prevChannel);

            // int tmp = this.channel;
            // this.channel = this.prevChannel;
            // this.prevChannel = tmp;
        }
        // (구현)
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

}
