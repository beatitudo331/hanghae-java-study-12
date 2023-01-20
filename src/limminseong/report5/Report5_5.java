package limminseong.report5;

//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

// 정답: weapon, armor. 모든 병사의 공격력과 방어력이 같다면, instance 별로 따로 생성, 관리할 필요가 없고, 클래스 변수로 사용되어야 한다.
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력
    static int armor = 0; //방어력
    static void weaponUp() {
        Marine.weapon++;
    }
    static void armorUp() {
        Marine.armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
