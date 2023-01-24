package parkjaeyong.report8.report7_3;

/**
  문제 : 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기 위해서는 코드를 어떻게 바꾸어야 하는가?

  이유 : 현재 부모 클래스에서는 정수값을 받는 생성자를 정의해주었고, 자식에서는 기본 생성자로 생성자 호출 시 호출할 부모 생성자를
 지정해주지 않은 상태이다. 이럴경우 컴파일러는 자식 생성자가 호출되는 시점에 super()를 자동으로 넣어줌으로 부모 생성자를 호출하여
 초기화를 진행하도록 한다. 그러나 현재 부모 생성자는 따로 정의했기에 컴파일러가 기본 생성자를 생성해주지 않기에 자식 생성자에서 호출하려는
 부모 기본생성자가 없기에 컴파일 단계에서 에러가 발생한다.

 해결방법 :
 1) 자식 클래스 기본생성자를 사용할 경우 부모 클래스에 기본 생성자를 추가해준다.
 2) 자식 클래스 기본생성자를 사용할 경우 부모 클래스에 정의되어 있는 생성자를 직접 호출해준다. -> super(1000) 이런식으로
 3) 자식 클래스에서 부모 생성자와 같은 정수값을 받는 생성자를 만들고 값을 받아서 부모 생성자를 호출해준다.
 */
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product(){}

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(1000);
    }

    Tv(int price){
        super(price);
    }

    public String toString() {
        return "Tv";
    }
}

public class Report7_3 {
    public static void main(String[] args) {
        Tv t = new Tv();
    }
}
