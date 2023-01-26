public class Ex4_4 {
    public static void main(String[] args) {
        int i =1, sum = 0;
        while (sum < 100) {
            if (i %2 ==0) {
                sum += -i;
                i += 1;
            } else {
                sum += i;  //199
                i += 1;    //200
            }
        }
        System.out.println(sum);
        System.out.println(i-1);
    }
}
