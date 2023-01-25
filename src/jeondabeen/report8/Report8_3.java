package jeondabeen.report8;

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
        // 자식 클래스 생성자에 부모 생성자 호출이 되어있지 않다면
        // 컴파일러가 자동으로 super()를 맨 윗 줄에 추가해주는데
        // 부모의 기본 생성자가 없고 매개변수를 필요로 하는 생성자만 존재해
        // 인자를 넘겨주지 못해 발생하는 Error다!
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
