package choiwonbin.report4;

public class Report4_2 {
    public static void main(String[] args) {

        //5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은?
        int[][]arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
        };
        System.out.print(arr[3].length);
    }
}

// arr[0][i] 5,5,5,5,5
// arr[1][i] 10,10,10
// arr[2][i] 20,20,20,20
// arr[3][i] 30,30
// arr[3].length 는 배열의 크기를 물어보는 것이므로, 배열의 arr[3]의 배열의 크기는 2.