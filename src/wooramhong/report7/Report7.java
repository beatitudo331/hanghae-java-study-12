package wooramhong.report7;

//7-1
//class Exercise6_17 {
//
//    public static int[] shuffle(int[] arr) {
//
//        for(int i = 0; i < arr.length; i++) {
//            int j = (int)(Math.random()*arr.length);
//
//            // arr[i]와 arr[j]의 값을 서로 바꾼다.
//            int tmp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = tmp;
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        System.out.println(java.util.Arrays.toString(original));
//
//        int[] result = shuffle(original);
//        System.out.println(java.util.Arrays.toString(result));
//    }
//}

//7-2
//class Exercise6_18 {
//    public static boolean isNumber(String str){
//        char[] a= str.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            int b=a[i]-48;
//            if(!(b<=9 && 0<=b)){
//                return false;
//            }
//        }return true;
//
//    }
//
//    public static void main(String[] args) {
//        String str = "123";
//        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
//        str = "1234o";
//        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
//    }
//}

//7-3번
//class MyTv {
//    boolean isPowerOn;
//    int channel;
//    int volume;
//    final int MAX_VOLUME = 100;
//    final int MIN_VOLUME = 0;
//    final int MAX_CHANNEL = 100;
//    final int MIN_CHANNEL = 1;
//    void turnOnOff() {
//        isPowerOn = !isPowerOn;
//        if (isPowerOn){
//            return;
//        }
//        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
//    }
//    void volumeUp() {
//        if (volume<MAX_VOLUME){
//            volume++;
//        }
//        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
//    }
//    void volumeDown() {
//        if (volume>MIN_VOLUME){
//            volume--;
//        }
//        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
//    }
//    void channelUp() {
//        if (channel<MAX_CHANNEL){
//            channel++;
//        } else if (channel==MAX_CHANNEL) {
//            channel=MIN_CHANNEL;
//        }
//        // (4) channel의 값을 1 증가시킨다.
//        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
//    }
//    void channelDown() {
//        if (channel>MIN_CHANNEL){
//            channel--;
//        } else if (channel==MIN_CHANNEL) {
//            channel=MAX_CHANNEL;
//        }
//        // (5) channel의 값을 1 감소시킨다 .
//        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
//    }
//}
//
//class Exercise6_19 {
//    public static void main(String args[]) {
//        MyTv t = new MyTv();
//        t.channel = 100;
//        t.volume = 0;
//        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//        t.channelDown();
//        t.volumeDown();
//        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//        t.volume = 100;
//        t.channelUp();
//        t.volumeUp();
//        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//    }
//}


//7-4번
//class Exercise6_20 {
//    static int big=0;
//    public static int max(int[] arr){
//        if((arr == new int[]{})||(arr==null)){
//            big = -9999;
//        }else{
//            for (int i = 0; i < arr.length ; i++) {
//                if (arr[i] > big) {
//                    big = arr[i];
//                }
//            }
//        }
//
//        return big;
//    }
//    public static void main(String[] args) {
//        int[] data = {3,2,9,4,7};
//        System.out.println(java.util.Arrays.toString(data));
//        System.out.println("최대값 :"+max(data));
//        System.out.println("최대값 :"+max(null));
//        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
//    }
//}

//7-5번
class Exercise6_21 {
    public static int abs(int value){
        if(value>=0){
            return value;
        }else{
            return -value;
        }
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10