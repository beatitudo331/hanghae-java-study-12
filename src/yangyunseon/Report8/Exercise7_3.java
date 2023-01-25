package yangyunseon.Report8;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    public Product(){

    }

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() { // 생성자에 this()나 super()가 없으면 자동으로 super()를 호출하는데
    }      // 부모에게 기본 생성자가 없기 때문에 여기서 에러가 난다.
           // 그래서 부모에게 기본 생성자를 만들어 주면 에러가 없어짐!
    public String toString() {
        return "Tv";
    }
}

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}