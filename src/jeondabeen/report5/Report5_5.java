package jeondabeen.report5;

public class Report5_5 {
    // weapon, armor에 static을 붙여야 한다.
    // weapon과 armor는 공유하는/같아야 하는 속성이기 때문이다.
}

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