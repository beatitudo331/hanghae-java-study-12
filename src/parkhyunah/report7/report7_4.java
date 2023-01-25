package day3.homework.report7;
/*
6-20. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
메서드명 : max
기능
주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
반환타입 : int
매개변수 : int[] arr - 최대값을 구할 배열
*/
public class report7_4 {
    // (1) max 메서드를 작성하시오 .
    public static int max(int[] arr) {
        if(arr == null || arr.length == 0)
            return arr;

        for(int x = 0; x< arr.length*2; x++){
            // 배열 index 범위 내의 임의의 두 값을 얻는다.
            int i = (int) (Math.random() * arr.length);
            int j = (int) (Math.random() * arr.length);

            // arr[i]와 arr[j]의 값을 서루 바꾼다.
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
}

