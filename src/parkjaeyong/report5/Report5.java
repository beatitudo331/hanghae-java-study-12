package parkjaeyong.report5;

public class Report5 {
}

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
class Exercise6_1{
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}


class Exercise6_2 {
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


//6-1. 다음과 같은 멤버 변수를 갖는 Student 클래스를 정의하세요.
// 6-3. 연습문제 6-1에서 정의한 Student 클래스에 다음과 같이 정의된 두 개의 메서드를 추가하세요.
class Student{
    String name; // 이름
    int ban;// 반
    int no; // 번호
    int kor; // 국어 점수
    int eng; // 영어 점수
    int math; // 수학 점수

    Student(){};
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        int sum = this.kor + this.eng + this.math;
        float avg = Math.round(sum / 3f * 10) / 10f;
        /*
            return하는 부분에서 총합/평균을 구하는 메서드 구현문제
            이전에 해당 메서드를 구현하는 문제가 나왔기에 따로 총합/평균 관련 메서드를 호출해서
            처리하지 않았습니다.
        */
        return this.name + ", " + this.ban + ", " + this.no + ", " +
                this.kor + ", " + this.eng + ", " + this.math + ", " +
                sum + ", " + avg;
    }

    /**
     * 총점 구하기
     * @return 총점
     */
    public int getTotal(){
        return this.kor + this.eng + this.math;
    }

    /**
     * 평균 구하기
     * @return 평균 값
     */
    public float getAverage(){
        return Math.round(getTotal()/ 3f * 10) / 10f;
    }
}

