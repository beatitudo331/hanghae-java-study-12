package jeondabeen.report5;

class Student{
    String name;
    int ban, no, kor, eng, math;

    public Student() {
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        // 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
        int total = kor+eng+math;
        float avg = (int) (total / 0.3 + 0.5) / 10f;

        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total + ", " + avg;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) (getTotal() / 0.3 + 0.5) / 10f;
    }
}