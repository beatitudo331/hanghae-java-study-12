package hanjiyoon.report8;

import java.util.Arrays;

//  섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
//  섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
//  단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
//  즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i=0; i<cards.length; i++){
            if (i==0||i==2||i==7){
                cards[i] = new SutdaCard2((i%10+1), true);
            }
            else {
                cards[i] = new SutdaCard2((i%10+1), false);
            }
        }
    }

    /*메서드명 : shuffle
    기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
    반환타입 : 없음
    매개변수 : 없음*/
    void shuffle(){
        for (int i=0; i<cards.length; i++){
            int num = (int)(Math.random()*CARD_NUM);
            SutdaCard2 tmp = cards[0];
            cards[0] = cards[num];
            cards[num] = tmp;
        }
    }
//    메서드명 : pick
//    기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//    반환타입 : SutdaCard
//    매개변수 : int index - 위치
    SutdaCard2 pick(int index){
        return cards[index];
    }

//    메서드명 : pick
//    기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//    반환타입 : SutdaCard
//    매개변수 : 없음
    SutdaCard2 pick(){
        return cards[(int)(Math.random()*CARD_NUM)];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}


class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck2 deck = new SutdaDeck2();

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