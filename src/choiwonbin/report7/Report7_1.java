package choiwonbin.report7;
// 6-17번 문제
public class Report7_1 {
    public static int[] shuffle(int[] arr){
        if(arr==null || arr.length==0)
            return arr;

        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
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
