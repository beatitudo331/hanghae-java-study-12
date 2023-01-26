package kimjuhui.report5;

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.

public class Report5_2 {
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}



class Student{
    String name;    //학생 이름
    int ban;    //반
    int no;     //번호
    int kor;    //국어 점수
    int eng;    //영어 점수
    int math;   //수학 점수

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        int sum = this.kor + this.eng + this.math;
        double avg =  (double) sum / 3;
        avg = (double)Math.round(avg*10)/10;
        return this.name + ", " + this.ban + ", " + this.no + ", " + this.kor + ", " + this.eng + ", " + this.math + ", " + sum + ", " + avg;
    }




}