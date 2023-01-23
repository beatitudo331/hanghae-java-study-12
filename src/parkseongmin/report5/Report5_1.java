package parkseongmin.report5;
// 6-1,2,3 번 문제
class Student {
    String name;
    int ban, no, kor, eng, math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        int total = kor + eng + math;
        return total;
    }

    public float getAverage() {
        float avg = (kor+eng+math)/3f;
        avg = ((int)(avg*10+0.5))/10f;
        return avg;
    }

    public String info() {
        Stirng[] str = new String[8];
        str[0] = name;
        str[1] = Integer.toString(ban);
        str[2] = Integer.toString(no);
        str[3] = Integer.toString(kor);
        str[4] = Integer.toString(eng);
        str[5] = Integer.toString(math);
        str[6] = Integer.toString(getTotal());
        str[7] = Float.toString(getAverage());
        return Arrays.toString(str);
    }
}


