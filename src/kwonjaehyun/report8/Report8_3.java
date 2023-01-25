package kwonjaehyun.report8;
//7-3번 문제
//7-3. 다음의 코드는 컴파일하면 에러가 발생한다.
// 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

//Product클래스에 매개변수가 비어있는 메소드가 없으므로 Product(){}로 오버로딩을 한다
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){}
    //구현부
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