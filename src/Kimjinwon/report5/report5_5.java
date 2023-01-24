package Kimjinwon.report5;

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


    정답 - weapon, armor는 마린인스턴스에 같은 값이어야 한다.
        - weaponUp(), armorUp()는 static변수에 작업하는 메서드.

    해설 - weapon, armor가 static 변수가 되어야 한다. 병사 생성 후에는 공격력과 방어력의 속성은 그대로지만
    이동 후에 위치는 변하고, 공격 당하면 체력이 각각 병사마다 소모되기에 위