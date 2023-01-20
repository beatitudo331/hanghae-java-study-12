//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
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

정답 :
static int hp = 60;
static int weapon = 6;
static int armor = 0;

// 체력과 공격력, 방어력은 모든 마린이 다 같으므로 static(클래스 변수) 으로 공통으로 줘야하고
// 이동 좌표인 int x, int y는 마린의 위치 이므로 모든 마린이 다 같은 위치에 있다고 장담할수 없으므로 인스턴스 변수(iv)로 줘야한다.