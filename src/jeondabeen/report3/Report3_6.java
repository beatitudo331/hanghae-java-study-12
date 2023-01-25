package jeondabeen.report3;

public class Report3_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i + j == 6) {
                    System.out.println("[" + i + ", " + j + "]");
                }
            }
        }
    }
}
