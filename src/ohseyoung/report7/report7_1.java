package ohseyoung.report7;
//6-17번 문제
class report7_1 {

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
    static int[] shuffle(int[] original){
        for(int i = 0; i<original.length; i ++){
            int tmp = original[i];
            original[i]=original[(int) (Math.random()*original.length)];
            original[(int) (Math.random()*9+1)]=tmp;
        }
        return original;
    }
}