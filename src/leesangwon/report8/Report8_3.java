package leesangwon.report8;
// 7-3번 문제
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product() {}    // Product클래스에 기본생성자 Product()가 없음. Product() 추가

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

class Report8_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}

