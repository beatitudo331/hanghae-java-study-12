package choyoungjun.report8;
//7-2. 연습문제 7-1. 의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//        [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//        메서드명 : shuffle
//        기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//        반환타입 : 없음
//        매개변수 : 없음

//        메서드명 : pick
//        기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//        반환타입 : SutdaCard
//        매개변수 : int index - 위치

//        메서드명 : pick
//        기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//        반환타입 : SutdaCard
//        매개변수 : 없음
public class Report8_2 { // 메서드는 8-1에 첨부함
    public static void main(String[] args) throws Exception {
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
