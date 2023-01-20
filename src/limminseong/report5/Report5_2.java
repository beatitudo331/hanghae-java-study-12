package limminseong.report5;

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
public class Report5_2 {
    public static void main(String[] args){
        Report5_2Student s = new Report5_2Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

// 정답:
class Report5_2Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Report5_2Student() {

    }

    Report5_2Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int)((getTotal() / 3f + 0.05f) * 10) / 10f;
    }

    String info() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(name + ", ");
        stringBuilder.append(ban + ", ");
        stringBuilder.append(no + ", ");
        stringBuilder.append(kor + ", ");
        stringBuilder.append(eng + ", ");
        stringBuilder.append(math + ", ");
        stringBuilder.append(getTotal() + ", ");
        stringBuilder.append(getAverage());

        return stringBuilder.toString();
    }
}