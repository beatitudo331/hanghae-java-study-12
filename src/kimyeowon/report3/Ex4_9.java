public class Ex4_9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        String str = new Integer(num).toString();
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum="+sum);
    }
}
