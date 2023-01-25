package hanjiyoon.report8;
//7-3. 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?
//Tv 클래스가 Product를 상속받는데, Tv()생성자가 호출되면 super()가 실행된다.
//그런데 부모 클래스인 Product에 매개변수 없는 생성자가 없기 때문에 에러가 나므로, 빈 생성자를 만들어주면 된다, Product(){}
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){

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