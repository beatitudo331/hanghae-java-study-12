package LEESEUNGRYEOL.report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        boolean iskwang;
        int[] checklist = new int[3];

        for (int i = 0; i < CARD_NUM/2; i++) {
            if (i+1 == 1 || i+1 == 3 || i+1 == 8) {
                cards[i] = new SutdaCard(i+1, true);
            }
            else{
                cards[i] =new SutdaCard(i+1 ,false);
            }
        }


        for (int i = CARD_NUM/2; i < CARD_NUM; i++) {
            if (i == 1 || i == 3 || i == 8) {
                cards[i] = new SutdaCard(i-9, false);
            }
            else{
                cards[i] =new SutdaCard(i-9,false);
            }
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
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        SutdaDeck1 deck = new SutdaDeck1();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,