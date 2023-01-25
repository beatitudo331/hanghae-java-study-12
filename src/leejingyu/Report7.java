package leejingyu;
//
class Exercise6_17 {

    public static int[] shuffle(int[] arr){
        if (arr==null || arr.length ==0){
            return arr;
        }

        for(int i=0; i<arr.length; i++){
            int j =(int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
        return arr;
    }

    /*shuffle 메서드를 작성하세요. */

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

class Exercise6_18 {

    /*isNumber 메서드를 작성하세요.*/
    public static boolean isNumber(String str) {
        if(str==null || str.equals(""))
            return false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        this.isPowerOn = !this.isPowerOn;
    }
    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if(volume<MAX_VOLUME){
            this.volume++;
        }
    }
    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if(volume>MIN_VOLUME){
            this.volume--;
        }
    }
    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
        if(channel==MAX_CHANNEL){
            this.channel = MIN_CHANNEL;
        } else{
            this.channel++;
        }
    }
    void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if(channel==MIN_CHANNEL){
            this.channel = MAX_CHANNEL;
        } else{
            this.channel--;
        }
    }
}

class Exercise6_19 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    }
}

//예상 결과 : CH: 100, VOL: 0 / CH: 99, VOL: 0 / CH: 100, VOL: 100

class Exercise6_20 {
    /* (1) max 메서드를 작성하시오 . */
    public static int max(int arr[]) {
        if (arr == null || arr.length ==0) {
            return -999999;
        }
        int maxarr= arr[0]; //초기화는 for문 밖에서 해주기

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxarr){
                maxarr= arr[i];
            }

        }
        return maxarr;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999

class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    public static int abs (int value){
        if(value>=0){
            return value;
        }
        else
            return -1*value;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = 0;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10