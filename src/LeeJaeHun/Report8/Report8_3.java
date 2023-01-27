package LeeJaeHun.Report8;
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    public Product() { // 자식클래스의 생성자가 생성될땐 부모 생성자의 default 생성자를 참조하는데 default생성자가 없었음

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
