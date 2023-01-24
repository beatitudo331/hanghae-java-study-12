package Kimjinwon.report7;

public class report7_1 {
    /*shuffle 메서드를 작성하세요. */
    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
    static int[] shuffle(int[] a){
        int idx = (int)(Math.random() * a.length);

        for(int i=0;i<a.length;i++){
            int tmp = a[i];
            a[i] = a[idx];
            a[idx] = tmp;
        }
        return a;
    }
}
