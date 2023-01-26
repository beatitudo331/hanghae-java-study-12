public class Ex4_5 {
    public static void main(String[] args) {
        int i=0;
        while (i<=10) {
//            System.out.println("*"*i + " "*(j-i));      // j =10, 자바는 문자열 곱셈 안됨
            int j =0;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
