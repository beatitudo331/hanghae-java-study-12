package LEESEUNGRYEOL.report8;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    // (구현)
    Product()
    {
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

// 틀린 이유
// 일단 틀린 부분은 TV(){} 기본생성자에서 문제가 발생하는데, 이때 문제가 발생하는 이유는
// Tv 생성자에서 모든 생성자는 첫줄에 다른 생성자를 호출해야 된다. 이때 Tv class 에서는 기본 생성자만 존재
// 따라서 자동적으로 super() 생성자를 호출한다. 하지만 super 은 Tv 클래스의 조상인 Product 인데 여기에는 기본생성자가 없다.
// 따라서 기본생성자를 생성하고 나면 오류가 사라진다.