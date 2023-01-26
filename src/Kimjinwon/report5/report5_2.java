package Kimjinwon.report5;

/6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
public class report5_2 {
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}


class Student{
    // 속성 : 변수 선언
    String name; // 이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어 점수
    int eng; // 영어 점수
    int math; // 수학 점수


    // 생성자
    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 기능 : 메서드 선언
    public String info(){
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+(kor+eng+math)
                +","+((int)((kor+eng+math) / 3f * 10 + 0.5f)/10f)
                ;
    }
}
