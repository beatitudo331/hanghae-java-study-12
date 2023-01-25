package kimdongmin.report5;
//6-2, 6-3 답지
//Report5_2.java와 Report5_3.java로 나누어 제출하고자 했으나
// java: duplicate class 에러가 뜨며 실행이 안되어서 따로 올립니다

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
public class Report5_2 {
}


class Exercise6_2{
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

//6-3. 연습문제 6-1에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드를 추가하세요.
//1. 메서드명 : getTotal
//기능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
//반환타입 : int
//매개변수 : 없음
//2. 메서드명 : getAverage
//기능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
//소수점 둘째자리에서 반올림할 것.
//반환타입 : float
//매개변수 : 없음

class Exercise6_3 {
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

class Student{
    /*빈 칸*/
    String name; //학생 이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어 점수
    int eng; // 영어 점수
    int math; // 수학 점수

    public Student(){

    }

    public Student (String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {
        return name +", "+ ban+", "+ no+", "+ kor+", "+ eng+", "+ math;
    }

    int getTotal() {
        int sum = kor+eng+math;
        return sum;
    }

    float getAverage() {
        float average = Math.round((kor+eng+math)*10/3f)/10f;
        return average;
    }

}