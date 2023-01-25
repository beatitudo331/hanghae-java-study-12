package limminseong.report8;


// 8-3번 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
// 정답 : 상속 받은 클래스에서 super()로 부모의 기본 생성자를 호출하는데, 부모의 기본 생성자가 정의되지 않아서 발생하는 에러이다.
//       이를 수정하기 위해서는, 기본 생성자를 만들어주면 된다.
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    // 정답:
    Product() {

    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {

    }

    public String toString() {
        return "Tv";
    }
}

public class Report8_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
