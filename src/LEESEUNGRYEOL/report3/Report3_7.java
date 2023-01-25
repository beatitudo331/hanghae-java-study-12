package LEESEUNGRYEOL.report3;
//4-7 문제
public class Report3_7 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;;
        int number;


        for (int i = 0; i < str.length(); i++) {
          number = str.charAt(i) - 48;
          sum += number;
        }

        System.out.println("sum=" + sum);
    }
}
