package kimdonghyeon.report8;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(10000);//부모클래스의 생성자를 없애거나 super();로 생성자를 넣어준다.
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