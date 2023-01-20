package kwonjaehyun.report5;
// 6-2 번 문제
//타입 : String, 변수명 : name, 설명 : 학생 이름
//타입 : int, 변수명 : ban, 설명 : 반
//타입 : int, 변수명 : no, 설명 : 번호
//타입 : int, 변수명 : kor, 설명 : 국어 점수
//타입 : int, 변수명 : eng, 설명 : 영어 점수
//타입 : int, 변수명 : math, 설명 : 수학 점수

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    public String info(){
        int tot=this.kor+this.eng+this.math;
        double avr=Math.round(((double)tot/3)*10);
        avr = avr/10;
        return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+tot+","+avr;
    }
    public Student(String nam,int ban, int no, int kor, int eng, int math){
        this.name = nam;
        this.ban = ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    public int getTotal(){
        return this.kor+this.eng+this.math;
    }
    public double getAverage(){
        double avr = Math.round(((double)getTotal()/3)*10);
        avr = avr/10;
        return avr;
    }
    public Student(){}
}

//6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
public class Report5_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);
        String str = s.info();
        System.out.println(str);
    }
}
