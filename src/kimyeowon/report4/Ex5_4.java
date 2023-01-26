public class Ex5_4 {
    public static void main(String[] args) {
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int tot = 0;
        int cnt =0;
        float avg = 0;

        for (int[] ints : arr) {
            for (int it:ints) {
//                System.out.println(it);
                tot += it;
                cnt += 1;
            }
        }
        System.out.println(tot);
        avg = (float)tot / cnt;
        System.out.println(avg);

    }
}
