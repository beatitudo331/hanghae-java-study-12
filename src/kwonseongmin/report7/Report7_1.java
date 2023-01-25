package kwonseongmin.report7;
// 6-17번 문제
class Exercise6_17 {


    static int[] shuffle(int[] array) {
        if(array==null || array.length==0) {
            return array;
        };
        for (int i = 0; i < array.length; i++) {

            int rIndex = (int)(Math.random() * array.length);

            int temp = array[i];

            array[i] = array[rIndex];

            array[rIndex] = temp;
        }

        return array;

    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
