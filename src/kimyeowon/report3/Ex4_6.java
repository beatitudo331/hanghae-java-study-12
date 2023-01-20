public class Ex4_6 {
    public static void main(String[] args) {
        for (int i=1; i<7; i++) {
            for (int j=1; j<7; j++) {
                if (i+j == 6) {
                    System.out.print(i + ", ");
                    System.out.println(j);
                }
            }
        }
    }
}
