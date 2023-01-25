package kimNahyun.report8;
// 7-3 번 문제

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(){}
    // Product 클래스에 기본 생성자 추가해줌
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv(){ super();}
    // 조상의 생성자 호출
    // super로 조상생성자를 호출해줬다. 다만 쓰지 않아도 자동으로 생성되긴 한다.

    public String toString() {
        return "Tv";
    }
}
public class Report8_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println(t);
    }
}
