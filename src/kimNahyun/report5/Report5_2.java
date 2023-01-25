package kimNahyun.report5;

import java.util.Arrays;

//6-2번 문제
public class Report5_2 {
    public static void main(String[] args){
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
}

class Student{

    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(){

    }

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info(){
        String[] info = new String[8];

        int total = kor+eng+math;
        float av = Math.round(10*(float)(kor+eng+math)/3.0f)/10.0f;

        info[0] = this.name;
        info[1] = ""+this.ban;
        info[2] = ""+this.no;
        info[3] = ""+this.kor;
        info[4] = ""+this.eng;
        info[5]= "" + this.math;
        info[6] = ""+total;
        info[7] = ""+av;

        String result = Arrays.toString(info);
        return result;
    }

    int getTotal(){
        int total = kor+eng+math;
        return total;
    }

    float getAverage(){
        float av = Math.round(10*(float)(kor+eng+math)/3.0f)/10.0f;
        return av;
    }
}