package kwonjaehyun.report7;
// 6-17번 문제
//메서드명 : shuffle
//기능
//주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//처리한 배열을 반환한다.
//반환타입 : int[]
//매개변수 : int[] arr - 정수값이 담긴 배열
public class Report7_1 {
    static int[] shuffle(int[] arr){
        int tmp = 0;
        int rand =0;
        for (int i = 0;i<arr.length;i++){
            tmp = arr[0];
            rand = (int) (Math.random()*(arr.length));
            arr[0]=arr[rand];
            arr[rand]=tmp;
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
