package leejingyu;

//6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
//타입 : String, 변수명 : name, 설명 : 학생 이름
//타입 : int, 변수명 : ban, 설명 : 반
//타입 : int, 변수명 : no, 설명 : 번호
//타입 : int, 변수명 : kor, 설명 : 국어 점수
//타입 : int, 변수명 : eng, 설명 : 영어 점수
//타입 : int, 변수명 : math, 설명 : 수학 점수

class Student{
    String name; // 학생이름
    int ban; //반
    int no; //번호
    int kor; //국어 점수
    int eng; //영어 점수
    int math; //수학 점수

    public Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

class Student {
    String name; // 학생이름
    int ban; //반
    int no; //번호
    int kor; //국어 점수
    int eng; //영어 점수
    int math; //수학 점수
    Student(){};
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {  // 전원 기능
        int total = this.kor + this.eng + this.math;
        double average = Math.round(total*10 / 3f);
        average /= 10;
        String info = String.valueOf(this.name)+" , " +String.valueOf(this.ban)+" , " +String.valueOf(this.no)+" , "+ String.valueOf(this.kor)+" , "+ String.valueOf(this.eng)+" , "+ String.valueOf(this.math)+" , "+String.valueOf(total)+" , "+String.valueOf(average);
        return info;
    }

    public static void main(String[] args) {
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

class Student {
    String name; // 학생이름
    int ban; //반
    int no; //번호
    int kor; //국어 점수
    int eng; //영어 점수
    int math; //수학 점수

    Student(){};
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){
        int total =this.kor+this.eng+this.math;
        return total;
    }
    double getAverage(){
        double average= Math.round(getTotal()/3f*10);
        return average/10;
    }


}

class Exercise6_4 {
    public static void main(String args[]) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println("이름 :"+s.name);
        System.out.println("총점 :"+s.getTotal());
        System.out.println("평균 :"+s.getAverage());
    }//예상 결과 : 이름 : 홍길동, 총점 : 236, 평균 : 78.7
}




//6-4. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.
class PlayingCard {
    int kind; // 인스턴스 변수
    int num; // 인스턴스 변수
    static int width; // 클래스 변수
    static int height; // 클래스 변수
    PlayingCard(int k, int n) {
        kind = k; //지역 변수
        num = n; //지역 변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}


//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
   static int weapon = 6; //공격력, 모든 병사의 위치와 체력과는 다르게 공격력이 weapon으로 공통되야함
   static int armor = 0; //방어력, 모든 병사의 방어력이 armor로 공통되야함
   static void weaponUp() { //static 변수를 다루는 메서드로써 static을 붙인다
        weapon++;
    }
   static void armorUp() { //static 변수를 다루는 메서드로써 static을 붙인다
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
