package kwonseongmin.report5;


//6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
//타입 : String, 변수명 : name, 설명 : 학생 이름
//타입 : int, 변수명 : ban, 설명 : 반
//타입 : int, 변수명 : no, 설명 : 번호
//타입 : int, 변수명 : kor, 설명 : 국어 점수
//타입 : int, 변수명 : eng, 설명 : 영어 점수
//타입 : int, 변수명 : math, 설명 : 수학 점수

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 6-2 정답
    String info() {
        //홍길동, 1, 1, 100, 60, 76, 236, 78.7
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
    }


    // 6-3 정답
    int getTotal() {
        return kor + eng + math;
    }

    // 6-3 정답
    float getAverage() {
        return Math.round(getTotal() / 3.0f * 10) / 10.0f;
    }
}