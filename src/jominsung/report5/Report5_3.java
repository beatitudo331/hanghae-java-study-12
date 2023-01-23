package jominsung.report5;

public class Report5_3 {
    public static void main(String[] args) {
        Students s = new Students();
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
class Students {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Students() {}

    int getTotal(){
        return kor + eng + math;
    }


    float getAverage(){
        return (int)(getTotal() /3f * 10 + 0.5f) / 10.f;
    }
}


