package limminseong.report8;

// 8-2번 8-1번의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
// 메서드명 : shuffle
//        기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//        반환타입 : 없음
//        매개변수 : 없음

// 메서드명 : pick
//        기능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//        반환타입 : SutdaCard
//        매개변수 : int index - 위치

// 메서드명 : pick
//        기능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//        반환타입 : SutdaCard
//        매개변수 : 없음

class SutdaDeck8_2 {
    final int CARD_NUM = 20;
    SutdaCard8_2[] cards = new SutdaCard8_2[CARD_NUM];

    SutdaDeck8_2() {
        for (int i = 0; i < CARD_NUM; ++i) {
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard8_2(i % 10 + 1, true);
            }
            else {
                cards[i] = new SutdaCard8_2(i % 10 + 1, false);
            }
        }
    }


    void shuffle() {
        // (구현)
        // 정답:
        for (int i = 0; i < CARD_NUM; ++i) {
            int j = (int)(Math.random() * CARD_NUM);
            SutdaCard8_2 temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    SutdaCard8_2 pick(int index) {
        // (구현)
        // 정답:
        return cards[index];
    }

    SutdaCard8_2 pick() {
        // (구현)
        // 정답:
        return cards[(int)(Math.random() * CARD_NUM)];
    }
}

class SutdaCard8_2 {
    int num;
    boolean isKwang;

    SutdaCard8_2() {
        this(1, true);
    }

    SutdaCard8_2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}

public class Report8_2 {
    public static void main(String args[]) {
        SutdaDeck8_2 deck = new SutdaDeck8_2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i < deck.cards.length;i++) {
            System.out.print(deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
