package leehyunbeen.report5;//6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
import java.util.Arrays;

class  Student {
    String name; //타입 : String, 변수명 name, 설명 : 학생 이름
    int ban;//타입 : int, 변수명 : ban, 설명 : 반
    int no;//타입 : int, 변수명 : no, 설명 : 번호
    int kor;//타입 : int, 변수명 : kor, 설명 : 국어 점수
    int eng;//타입 : int, 변수명 : eng, 설명 : 영어 점수
    int math;//타입 : int, 변수명 : math, 설명 : 수학 점수

    public Student(){
        this.name = "name";
        this.ban =0;
        this.no = 0;
        this.kor = 0;
        this.eng = 0;
        this.math = 0;
    }
    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban =ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }
    public int getTotal(){
        int total= 0;
        total = kor + eng + math;

        return total;
    }
    public float getAverage(){
        float avg = (kor+eng+math)/3f;
        avg = ((int)(avg*10+0.5))/10f;

        return avg;
    }

    public String info() {
        String[] str = new String[8];
        str[0] = name;
        str[1] = Integer.toString(ban);
        str[2] = Integer.toString(no);
        str[3] = Integer.toString(kor);
        str[4] = Integer.toString(eng);
        str[5] = Integer.toString(math);
        str[6] = Integer.toString(getTotal());
        str[7] = Float.toString(getAverage());
        return Arrays.toString(str);
    }
}


//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
class Exercise6_2{
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}


//6-3. 연습문제 6-1에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드를 추가하세요.
//1. 메서드명 : getTotal
//기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//반환타입 : int
//매개변수 : 없음
//2. 메서드명 : getAverage
//기능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 : 없음
class Exercise6_3 {
    public static void main(String args[]) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름 :"+s.name);
        System.out.println("총점 :"+s.getTotal());
        System.out.println("평균 :"+s.getAverage());
    }//예상 결과 : 이름 : 홍길동, 총점 : 236, 평균 : 78.7
}


//6-5. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.
class PlayingCard {
    int kind;                       //인스턴스 변수
    int num;                        //인스턴스 변수
    static int width;               //클래스 변수
    static int height;              //클래스 변수
    PlayingCard(int k, int n) {
        kind = k;                   //지역 변수
        num = n;                    //지역 변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}


//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

//int weapon, int amor, void weaponUp(), void armorUp() 앞에 붙여줘야 한다.
//모든 병사들의 공격력과 방어력이 같다는 것은 weaponUp()이나 armorUp()을 실행했을 떄
//모든 병사들의 weapon과 armor가 변해야한다. 즉 static을 붙여주어 각각의 Marine에서만
//weapon()과 armor()가 실행하지 못하게 해야하며, Marine 클래스를 상속받은 모든 객체의
//weapon과 armor가 같아야 하고 똑같이 증가 해야하한다.
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력
    static int armor = 0; //방어력
    void weaponUp() {
        weapon++;
    }
    static void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Exercise6_7 {
    public static void main(String args[]) {

        Marine n = new Marine();
        n.hp = 55;
        n.weapon = 6;
        Marine g = new Marine();
        g.hp = 400;
        g.weapon = 18;
        System.out.println(n.hp +" 과 "+ n.weapon);
        System.out.println(g.hp +" 과 "+ g.weapon);

        n.weaponUp();

        System.out.println(n.hp +" 과 "+ n.weapon);
        System.out.println(g.hp +" 과 "+ g.weapon);

    }
}
