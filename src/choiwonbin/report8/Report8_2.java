package choiwonbin.report8;
//  7-3
public class Report8_2 {

        public static void main(String[] args) {
            Tv t = new Tv();
        }
    }
class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product(){}     //  기본생성자가 없기 때문에 오류가 발생

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv extends Product{
    Tv() {

    }

    public String toString() {
        return "Tv";
    }
}

