package LEESEUNGRYEOL.report7;

// 6-17번 문제
// shuffle method 작성 -> 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복
// 반환타입 int 리스트, 매개변수 int[] arr (정수값이 담긴 배열)
public class Report7_1 {

    static int[] shuffle(int[] original) {
        int tmp;
        for (int i = 0; i < original.length; i++) {
            int random_num = (int) (Math.random() * original.length);
            tmp = original[i];
            original[i] = original[random_num];
            original[random_num] = tmp;
        }
        return original;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
