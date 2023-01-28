package yangyunseon.report4;

//5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
public class Exercise5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        System.out.println(sum);
    }
}
