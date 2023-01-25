package geunhokim.report5;

//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가? static 속성값이 공통으로
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    int weapon = 6; //공격력
    int armor = 0; //방어력
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

// static을 붙여야 하는 것들 : weapon, armor, weaponUp, armorUp
// 이유 : weapon과 armor는 같은 병사니까 공통된 속성이므로, static을 사용해야 한다.
//        그리고 weapon메서드와 armor메서드는 static 변수를 사용하므로 둘 다 역시 static이 되어야 한다.