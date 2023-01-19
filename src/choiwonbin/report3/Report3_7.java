package choiwonbin.report3;
//  4-7
public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum=0;

        for (int i = 0; i < str.length(); i++) {
            sum+=str.charAt(i)-'0';
        }
            System.out.println(sum);
    }
}
// charAt(int i)메서드는 문자열에서 i번째 문자를 반복한다.(i의 값은 0부터 시작한다.)
