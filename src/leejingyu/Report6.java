package leejingyu;

6-8. 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오) //b,e
        a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
        b. 생성자는 객체를 생성하기 위한 것이다. //객체 생성하지만, 객체 초기화를 위한것, 객체생성은 new연산자
        c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
        d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
        e. 생성자는 오버로딩 할 수 없다. // 같은 이름을 갖더라도 매개변수를 다르게 설정하여 오버로딩 가능하다

        6-9. 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오) //b
        a. 객체 자신을 가리키는 참조변수이다.
        b. 클래스 내에서라면 어디서든 사용할 수 있다. //인스턴스메서드에서만 사용가능하다
        c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
        d. 클래스 메서드 내에서는 사용할 수 없다.

        6-10. 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오) // 3,4
        a. 메서드의 이름이 같아야 한다.
        b. 매개변수의 개수나 타입이 달라야 한다.
        c. 리턴타입이 달라야 한다.
        d. 매개변수의 이름이 달라야 한다.

        6-11. 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오) //b,c,d
        > long add(int a, int b) { return a+b; }

        a. long add(int x, int y) { return x+y; }
        b. long add(long a, long b) { return a+b; }
        c. int add(byte a, byte b) { return a+b; }
        d. int add(long a, int b) { return (int)(a+b); }

        6-12. 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오) //c,e
        a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
        b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
        c. 초기화 블럭보다 생성자가 먼저 수행된다.
        d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
        e. 클래스변수보다 인스턴스변수가 먼저 초기화된다

        6-13. 다음 중 인스턴스변수의 초기화 순서가 올바른 것은? //a
        a. 기본값-명시적초기화-초기화블럭-생성자
        b. 기본값-명시적초기화-생성자-초기화블럭
        c. 기본값-초기화블럭-명시적초기화-생성자
        d. 기본값-초기화블럭-생성자-명시적초기화

        6-14. 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오) //a, e
        a. 자동 초기화되므로 별도의 초기화가 필요없다.
        b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
        c. 메서드의 매개변수로 선언된 변수도 지역변수이다. //지역 변수는 호출 스택에서 생성됨
        d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
        e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. //힙 영역은 인스턴스 및 인스턴스 변수 생성영역,