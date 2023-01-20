package ohseyoung.report5;
//6-2번 문제
class Student{
    String name;
    int ban,no,kor,eng,math;
    static int sta;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
    }
}

public class report5_2{
    public static void main(String[] args) {
        Student s = new Student("홍길동",1 ,1,100, 60, 76);
        String str = s.info();
        System.out.println(str);
    }
}