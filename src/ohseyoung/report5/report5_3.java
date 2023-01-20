package ohseyoung.report5;
//6-4번 문제

class Student1{
    String name;
    int ban,no,kor,eng,math;

    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return (int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f;
    }
}

public class report5_3 {
    public static void main(String[] args) {
        Student1 s = new Student1();
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
