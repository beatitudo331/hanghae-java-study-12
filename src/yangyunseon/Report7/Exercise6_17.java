package yangyunseon.Report7;

class Exercise6_17 {

    static int[] shuffle(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * arr.length);
            temp = arr[0];
            arr[0] = arr[random];
            arr[random] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}