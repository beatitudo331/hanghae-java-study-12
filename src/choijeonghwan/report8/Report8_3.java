//7-3. 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
// 상속의 모체인 Product와 상속받은 TV 클래스 내의 생성자 선언을 하지 않아서 이를 선언해주어야한다.
package report8;
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    public Product(int price, int bonusPoint) {
        this.price = price;
        this.bonusPoint = bonusPoint;
    }

    // (구현)

    Product() {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super();
    }

    public String toString() {
        return "Tv";
    }
}

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}