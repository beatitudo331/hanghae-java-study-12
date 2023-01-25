package kimdonghyeon.report7;
// 6-17번 문제
public class Report7_1 {
    public static int[] shuffle(int[] arr){
        int random = 0;
        int temp = 0;
        for(int i=0; i < arr.length; i++){
            random = (int)(Math.random() * arr.length);
            temp = arr[random];
            arr[random] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Report7_1 report = new Report7_1();
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
