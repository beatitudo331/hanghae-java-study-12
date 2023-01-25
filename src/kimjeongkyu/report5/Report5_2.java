package kimjeongkyu.report5;

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
class Report5_2 {
    public static void main(String[] args) {
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

class Student2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;


    public String info() {
        return name + ", "
            + ban + ", "
            + no + ", "
            + kor + ", "
            + eng + ", "
            + math + ", "
            + (kor + eng + math) + ", "
            + Math.round(((kor + eng + math) / 3.0 * 10)) / 10.0;
    }

    public Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }
}