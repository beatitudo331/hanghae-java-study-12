package ohseyoung.report8;
//7-3번 문제
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(){}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {  // Tv클래스를 기본 생성자 Tv()로 초기화 했을때 부모 클래스의
            // 기본생성자를 호출하지만 부모클래스의 기본생성자가 없기때문에 오류가 발생했습니다.
        super();
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