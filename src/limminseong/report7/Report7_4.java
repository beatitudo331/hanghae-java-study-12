package limminseong.report7;

//6-20. 다음과 같이 정의된 메서드를 작성하고 테스트하세요.
//        메서드명 : max
//        기능
//        주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
//        만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//        반환타입 : int
//        매개변수 : int[] arr - 최대값을 구할 배열
public class Report7_4 {
    /* (1) max 메서드를 작성하시오 . */
    // 정답:
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        }

        int result = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        // System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값:"+max(data)); // 최대값
        System.out.println("최대값:"+max(null)); // null
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999