package kwonseongmin.report8;


public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i+1 == 1 || i+1 == 3 || i+1 == 8;

            SutdaCard card = new SutdaCard(num, isKwang);
            cards[i] = card;
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length - 1; i++) {
            SutdaCard temp = cards[i];
            int randomIndex = (int)(Math.random() * cards.length);

            cards[i] = cards[randomIndex];

            cards[randomIndex] = temp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        return cards[(int)(Math.random() * cards.length)];
    }
}