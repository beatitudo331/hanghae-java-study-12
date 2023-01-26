package Kimjinwon.report8;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){}

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

// 해설 : 기본 생성자가 없기에 추가 필요.