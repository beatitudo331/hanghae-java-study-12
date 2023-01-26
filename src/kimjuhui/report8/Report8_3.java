package kimjuhui.report8;

public class Report8_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

// 정답 : Product 클래스에 기본생성자를 다음과 같이 추가해야한다.
// Product() {
//
// }


// 이유 : main에서 Tv클래스의 인스턴스를 생성하였기에
// 바로 생성자 Tv()가 호출되고,
// Tv()는 조상의 생성자인 super()를 호출하게 된다.
// 컴파일러가 자동으로 super()를 Tv() 생성자 안에 추가해주는데,
// super()가 조상 생성자인 Product()를 호출하려고 보니,
// Product 클래스에는 기본 생성자인 Product()가 존재하지 않아 오류가 나는 것이다.
// 때문에 기본 생성자 Product()를 정의해주었다.

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
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
