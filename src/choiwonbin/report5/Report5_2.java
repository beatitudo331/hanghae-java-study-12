package choiwonbin.report5;
// 6-2 번 문제
public class Report5_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());

        String stsr = s.info();
        System.out.println(stsr);
    }
}

class Student {
    // 정답
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total;
    float average;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setAverage(float average) {
        this.average = average;
    }


    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getNo() {
        return no;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }


    public String info() {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage();

    }
}
