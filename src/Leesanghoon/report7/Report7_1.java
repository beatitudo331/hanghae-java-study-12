package Leesanghoon.report7;
// 6-17번 문제
public class Report7_1 {

    static int[] shuffle(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int index = (int)(Math.random()* arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
