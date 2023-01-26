package kimdoyeon.report3;
// 4-6 번 문제
public class Report3_6 {
    public static void main(String[] args) {
        AddClass6 addClass = new AddClass6();
        int[] selected = new int[2];
        addClass.test(0, selected);
    }
}

class AddClass6 {
    void test(int k, int[] selected) {
        if (k == 2) {
            int sum = 0;
            for (int i : selected) {
                sum += i;
            }
            if (sum == 6) {
                System.out.println(selected[0] + " + " + selected[1] + " = 6");
            }
        } else {
            for (int cand = 1; cand <= 6; cand++) {
                selected[k] = cand;
                test(k + 1, selected);
                selected[k] = 0;
            }
        }
    }
}
