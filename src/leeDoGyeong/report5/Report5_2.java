package leeDoGyeong.report5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Report5_2 {

    //6-2. 6-1에서 정의한 Student 클래스에 생성자와 info()를 추가해서 실행결과와 같은 결과를 얻도록 하세요.
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

    Student( String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }

    public Student() {

    }


    String info(){
        String[] info = new String[8];

        int total = kor + eng + math;
        double avg = Math.round(10*total/3.0)/10.0;

        info[0] = name;
        info[1] = ""+ban;
        info[2] = "" + no;
        info[3] = "" + kor;
        info[4] = "" + eng;
        info[5] = "" + math;
        info[6] = "" + total;
        info[7] = "" + avg;

        String result = Arrays.toString(info);
        result = result.substring(1, result.length() -1);

        return  result;

    }

    int getTotal(){
        int total = kor + math + eng;
        return  total;
    }

    double getAverage(){
        int total = kor + math + eng;
        double avg = Math.round(10*total/3.0)/ 10.0;
        return avg;
    }


}
