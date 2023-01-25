/*
섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이 어야 한다.
즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
 */
// 왜 값이 1, 3, 8 을 넣어야 하는가?
/*
i     i%10   i%10+1
0       0       1
1       1       2
2       2       3
3       3       4
4       4       5
5       5       6
6       6       7
7       7       8
8       8       9
9       9       10
10      0       1
11      1       2
12      2       3
13      3       4
14      4       5
15      5       6
16      6       7
17      7       8
18      8       9
19      9       10
 */
package day4.homework.Report8;

class SutdaDeck {
    final int CARD_NUM = 20;
    sutdacard[] cards = new sutdacard[CARD_NUM];
    // SutdaDeck인스턴스를 저장하기 위한 공간을 생성한 것 뿐! 객체배열을 생성할 때, 배열만 생성해 놓고 객체를 생성하지 않는 실수 주의!!
    // 생성자를 통해 객체배열 SutdaDeck에 SutdaDeck인스턴스를 생성해서 저장!
    // 반복문을 이용해서 배열의 크기만큼 SutdaDeck인스턴스를 생성하면 되는데 num, isKwang의 값은 어떻게 넣을 것인가??
    SutdaDeck() {
        // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
        for (int i=0; i < cards.length; i++){
            int num = i % 10 + 1;
            //num의 값이 1,3,8일 때, 한 쌍의 카드 중에서 하나는 광(kwang)이어야하므로 아래와 같은 조건식이 필요
            // AND(&&)가 OR(||)보다 우선순위가 높기 때문에 괄호를 꼭 사용
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new sutdacard(num, isKwang);
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
        return num + ( isKwang ? "K":"");
    }
}

class Exercise7_1 {
    public static void main(String args[]) {
        sutdaDeck deck = new sutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,

