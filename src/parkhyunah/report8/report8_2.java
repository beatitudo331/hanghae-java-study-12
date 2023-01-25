/*
7-2. 연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
메서드명 : shuffle
기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
반환타입 : 없음
매개변수 : 없음
메서드명 : pick
기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
반환타입 : SutdaCard
매개변수 : int index - 위치
메서드명 : pick
기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
반환타입 : SutdaCard
매개변수 : 없음
*/
package day4.homework.Report8;

class sutdaDeck {
    final int CARD_NUM = 20;
    sutdacard[] cards = new sutdacard[CARD_NUM];
    sutdaDeck() {
        int j = 0;
        int count=1;
        for (int i = 0; i < CARD_NUM; i++) {
            if (j==10)
            {j=0;}

            if (j+1==3||j+1==1||j+1==8){
                if (count <4){
                    cards[i] = new sutdacard(j+1,true);
                    count++;
                }
                else {
                    cards[i] = new sutdacard(j + 1, false);
                }
            }else {
                cards[i] = new sutdacard(j + 1, false);
            }
            j++;
        }
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
    }
    // 여기서부터 7-2번 문제
    sutdacard pick(int index){
        return cards[index];
    }
    sutdacard pick(){
        return cards[(int)(Math.random()*CARD_NUM)];
    }
    void shuffle(){
        sutdacard tmp = new sutdacard();
        int rand;
        for (int i = 0; i < CARD_NUM*3; i++) {
            rand = (int)(Math.random()*CARD_NUM);
            tmp = cards[0];
            cards[0] = cards[rand];
            cards[rand]= tmp;
        }
    }
} // SutdaDeck

class sutdacard {
    int num;
    boolean isKwang;

    sutdacard() {
        this(1, true);
    }

    sutdacard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        sutdaDeck deck = new sutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}




//예상결과)
// 1K
// 7
// 2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
// 2

