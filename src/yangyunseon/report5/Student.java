package yangyunseon.report5;

public class Student {
    String name; //학생이름
    int ban;    //반
    int no; //번호
    int kor;    //국어 점수
    int eng;    //영어 점수
    int math;   //수학 점수

    Student(String a, int b, int c, int d, int e, int f) {
        name = a;
        ban = b;
        no = c;
        kor = d;
        eng = e;
        math = f;
    }

    public Student() {

    }

    String info() {
        String info = null;
        int sum = kor + eng + math;
        float average = (float) (Math.round((float) (sum / 3.0 * 10)) / 10.0);
        info = ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + sum + ", " + average;
        return info;
    }

    int getTotal() {
        int total = kor + eng + math;
        return total;
    }

    float getAverage() {
        float aver = (float) (Math.round((float) (getTotal() / 3.0 * 10)) / 10.0);
        return aver;
    }


}

class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

class Exercise6_3{
    public static void main(String[] args) {
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
    }
}
