package kimjuhui.report4;

public class Report4_1 {
    public static void main(String[] args) {
        //5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.
        //int[] arr[];
        // X, int[] arr 으로 선언하거나 int arr[] 으로 선언해야한다.
        //int[] arr = {1,2,3,};
        //X, 배열의 원소 마지막에는 ,를 사용해서는 안된다.
        int[] arr = new int[5];
        //int[] arr = new int[5]{1,2,3,4,5};
        //X, 변수의 크기를 정하며 값을 지정하는 방식은 없다.
        //int arr[5];
        //X, int arr[] = int[5] 의 형식으로 해야한다.
        //int[] arr[] = new int[3][];
        //X, int[][] arr = new int[3][] 으로 하거나, int arr[][] = new int[3][] 으로 사용해야한다.
    }
}
