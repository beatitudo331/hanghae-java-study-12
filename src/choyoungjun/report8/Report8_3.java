package choyoungjun.report8;
//7-3. 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

//[해설]
//1.product 기본 생성자를 만들어 준다
//2.main class에 argument로 price를 넣어준다.
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

    Tv(int price) {
        super(price);
    }

    public Tv() {
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
