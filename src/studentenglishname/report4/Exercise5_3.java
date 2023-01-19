package studentenglishname.report4;

class Exercise5_3{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        /*빈 칸*/
        for (int i=0; i<=arr.length-1; i++){
            sum+=arr[i];
        }
        System.out.println("sum="+sum);
    }
}