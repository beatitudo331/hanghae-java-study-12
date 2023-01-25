package kimjeongkyu.report8;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){}
    // 기본생성자가 없어서 오류
    // 생성자가 하나도 없으면 컴파일러가 추가해주지만
    // 기존에 이미 하나가 있었기 때문에 기본 생성자가 추가되지 않음

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

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
