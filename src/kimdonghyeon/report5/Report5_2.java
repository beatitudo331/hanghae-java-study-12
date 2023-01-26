package kimdonghyeon.report5;
// 6-2 번 문제
public class Report5_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        String str = s.info();
        System.out.println(str);
    }
}

class Student{
    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어 점수
    int eng; // 영어 점수
    int math; // 수학 점수

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public String info(){
        int total = kor+eng+math;
        float average = Math.round(total/3f * 10) / 10f;

        return name + ", " + ban+ ", "  + no+ ", "  + kor+ ", "  + eng+ ", "  + math+ ", "  + total + ", "  + average;
    }
}
