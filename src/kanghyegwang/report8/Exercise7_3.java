package kanghyegwang.report8;

class Product {
    int price;
    int bonusPoint;

    // (구현)
    Product() {}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {
    Tv() {
    }

    public String toString() {
        return "Tv";
    }
}

public class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

// 정답 : Product클래스에 기본 생성자를 작성하지 않아서 에러가 난 것이다.
// Product(int price) 생성자위에 Product() {} 기본 생성자를 추가하면 된다