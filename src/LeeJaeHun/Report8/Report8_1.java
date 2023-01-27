//package LeeJaeHun.Report8;
//
//class SutdaDeck {
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//    SutdaDeck() {
//        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
//        for (int i =0; i <cards.length  ; i++){
//            if ( i<10 &&i+1 ==1 ||i+1==3||i+1==8){
//                cards[i] = new SutdaCard(i+1, true);
//            }else{
//                cards[i] = new SutdaCard(i%10+1, false);
//            }
//        }
//    }
//}
//
//class SutdaCard {
//    int num;
//    boolean isKwang;
//
//    SutdaCard() {
//        this(1, true);
//    }
//
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//
//    // info()대신 Object클래스의 toString()을 오버라이딩했다.
//    public String toString() {
//        return num + ( isKwang ? "K":"");
//    }
//}
//
//public class Report8_1 {
//
//
//        public static void main(String args[]) {
//            SutdaDeck deck = new SutdaDeck();
//
//            for (int i = 0; i < deck.cards.length; i++)
//                System.out.print(deck.cards[i] + ",");
//        }
//
//}
