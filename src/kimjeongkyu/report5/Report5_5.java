package kimjeongkyu.report5;

//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
class Marine {
    int x = 0, y = 0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    int weapon = 6; //공격력
    int armor = 0; //방어력
    // 체력과 공격력, 방어력 멤버변수에 static 키워드를 붙여서 인스턴스변수로 만들어야한다.
    // Marine 클래스에서 나온 인스턴스들은 다른 객체라도 모두 같은 성능을 가져야하기 때문이다.

    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
