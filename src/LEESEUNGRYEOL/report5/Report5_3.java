package LEESEUNGRYEOL.report5;
// 6-3 문제
public class Report5_3 {
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

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    double sum;
    double avg;
    int getTotal()
    {
        int total;
        total = kor + eng + math;
        return total;
    }

    float getAverage()
    {
        double average;
        average = (double)(kor+eng+math)/3;
        average = Math.ceil(average *10)/10;
        return (float)average;
    }
}