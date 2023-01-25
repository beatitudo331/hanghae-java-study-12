package wooramhong.report5;


//5-2
class Report5_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}
//5-3
class Exercise6_4 {
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
//5-1
class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    static int total;
    static float aver;
    Student(){}
    Student(String name, int ban, int no,int kor,int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return (float)getTotal()/3;
    }
    String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math;
    }
}


//5-4
class PlayingCard {
    int kind; //인스턴스 변수
    int num; //인스턴스 변수
    static int width; //클래스 변수
    static int height; //클래스 변수
    PlayingCard(int k, int n) {
        kind = k; //전역변수
        num = n; //전역변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
//5-5
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력 - 모든 마린들의 공격력은 같아야 하기 때문
    static int armor = 0; //방어력 - 모든 마린들의 방어력은 같아야 하기 때문
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