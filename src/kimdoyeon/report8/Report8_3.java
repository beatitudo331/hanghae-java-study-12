package kimdoyeon.report8;
// 7-3 번 문제
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현) 기본 생성자를 만든다.
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

class Exercise7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}


/*
    Tv 클래스에서 기본 생성자를 호출하면, 조상인 Product의 생성자를 호출하게 되어 있다.
    그런데 Prodcut 클래스에는 기본 생성자가 구현되지 않았으므로, Tv 클래스에서 기본 생성자를 호출하면 에러가 난다.
    조상클래스인 Product에 기본 생성자를 추가하면 문제가 해결된다.
 */