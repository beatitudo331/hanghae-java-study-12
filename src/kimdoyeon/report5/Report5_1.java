package kimdoyeon.report5;
// 6-1 번 문제, 6-2 번 문제, 6-3 번 문제
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student() {}

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)(this.getTotal() / 3f * 10 + 0.5) / 10f;
    }
}
