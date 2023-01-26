package seoliha.report5;
//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

public class Report5_5 {
}
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    int weapon = 6; //공격력 => static 붙여야 함.
    int armor = 0; //방어력 => static 붙여야 함.
    // static 붙여야 하는 이유 : 클래스 변수(cv)는 인스턴스 변수(iv)와 달리,
    // 어떤 상황에도 바뀌면 안되는 값이라서 고정해야 할때 static을 붙여 선언한다.
    // 모든 객체가 메모리를 공유하기 때문에 어디서나 접근해서 사용할 수 있으며,
    // GC가 청소해버리면 안되기 때문에 static 영역에 넣어야 해서 static을 붙여 선언하는 것.

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

