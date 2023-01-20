package parkjaeyong.report5;

//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

/**
 * 정답)
 * 공격력 , 방어력
 * 이유 : 클래스 위치에는 인스턴스 변수와 클래스 변수가 위치할 수 있다. 이때 클래스 변수는 해당 클래스의 인스턴스가
 * 공통으로 가져야 하는 속성일 경우 정의하며, 인스턴스 변수는 인스턴스가 개별적으로 가져야할 속성일 경우 정의한다.
 */
public class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력
    static int armor = 0; //방어력
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

    int add(byte a, byte b){
        return 1;
    }
    int add(long a, int b){
        return (int)a+b;
    }
    long add(long a, long b){
        return a+b;
    }

    public static void main(String[] args) {
        Marine m = new Marine();
        m.add(1000L,100);
    }
}
