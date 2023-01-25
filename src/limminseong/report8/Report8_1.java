package limminseong.report8;

// 8-1번
//        섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//        섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//        단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//        즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
class SutdaDeck8_1 {
    final int CARD_NUM = 20;
    SutdaCard8_1[] cards = new SutdaCard8_1[CARD_NUM];

    SutdaDeck8_1() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        // 정답:
        for (int i = 0; i < CARD_NUM; ++i) {
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard8_1(i % 10 + 1, true);
            }
            else {
                cards[i] = new SutdaCard8_1(i % 10 + 1, false);
            }
        }
    }
}

class SutdaCard8_1 {
    int num;
    boolean isKwang;

    SutdaCard8_1() {
        this(1, true);
    }

    SutdaCard8_1(int num, boolean isKwang) {
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
        SutdaDeck8_1 deck = new SutdaDeck8_1();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,