package kimjeongkyu.report6;

import java.util.Arrays;

class TestMain {
    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5};
        int[] answer = new int[num_list.length];

        for (int i = num_list.length-1; i >= 0; i--) {
            answer[num_list.length - i-1] = num_list[i];
        }


        System.out.println(Arrays.toString(answer));

    }
}


