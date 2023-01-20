package kimhyunho.report4;

//5-3. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하세요.
class Report4_3 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
//            arr[0] = 10
//            arr[1] = 20
//            arr[2] = 30
//            arr[3] = 40
//            arr[4] = 50

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
            sum += arr[i];
            //arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
        }

        System.out.println("sum="+sum);
    }
}//예상 결과 : sum=150
