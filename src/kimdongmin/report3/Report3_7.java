package kimdongmin.report3;

//4-7 문제
public class Report3_7 {
}

class Exercise4_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            /*빈 칸*/
            sum += str.charAt(i)-'0';
            //빈칸 끝
        }

        System.out.println("sum=" + sum);
    }
}//예상 결과 : sum=15

//정답은 sum += str.charAt(i)-'0'; 입니다.