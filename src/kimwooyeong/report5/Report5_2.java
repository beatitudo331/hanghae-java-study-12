package kimwooyeong.report5;
// 6-2 번 문제
//타입 : String, 변수명 : name, 설명 : 학생 이름
//타입 : int, 변수명 : ban, 설명 : 반
//타입 : int, 변수명 : no, 설명 : 번호
//타입 : int, 변수명 : kor, 설명 : 국어 점수
//타입 : int, 변수명 : eng, 설명 : 영어 점수
//타입 : int, 변수명 : math, 설명 : 수학 점수

import java.util.Arrays;

class Student {
    String name;
    int ban, no, kor, eng, math;
    public Student(){
        this("홍길동", 1, 1, 0, 0, 0);
    }
    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){
        int total;
        total = kor + eng + math;
        return total;
    }
    float getAverage(){
        float average;
        average = Math.round((kor + eng + math)*10 / 3f)/10f;
        return average;
    }
    String info() {
        String arr[] = new String[8];
        arr[0] = name;
        arr[1] = Integer.toString(ban);
        arr[2] = Integer.toString(no);
        arr[3] = Integer.toString(kor);
        arr[4] = Integer.toString(eng);
        arr[5] = Integer.toString(math);
        arr[6] = Integer.toString(getTotal());
        arr[7] = Float.toString(getAverage());
        return Arrays.toString(arr);
    }
}


class Exercise6_2{
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

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
class PlayingCard {
    int kind;    // 인스턴스변수
    int num;     // 인스턴스변수
    static int width;   // 스테틱 변수
    static int height;  // 스테틱 변수
    PlayingCard(int k, int n) {
        kind = k;   // 지역 변수
        num = n;    // 지역 변수
    }
    public static void main(String args[]) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
class Marine {
    int x=0, y=0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int  weapon = 6; //공격력 모두 공통이기떄문에 스테틱 변수로 지정해야함
    static int armor = 0; //방어력 모두 공통이기떄문에 스테틱 변수로 지정해야함
    static void weaponUp() {  // 공격력 업그레이드 시 모든 마린의 공격력이 올라가야함
        weapon++;
    }
    static void armorUp() {    // 방어력 업그레이드 시 모든 마린의 공격력이 올라가야함
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}