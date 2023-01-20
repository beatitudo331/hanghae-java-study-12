package kimwooyeong.report7;

import java.util.Arrays;

// 6-17번 문제
class Exercise6_17 {

    public static int[] shuffle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int cnt = (int)(Math.random()*arr.length);
            int temp = arr[cnt];
            arr[cnt] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}


class Exercise6_18 {
    static boolean isNumber(String str) {
        if(str == null || str.equals("")){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char apb = str.charAt(i);
            if (apb < '0' || apb > '9' ){
                return false;
            }
        }
        return true;
    }
    /*isNumber 메서드를 작성하세요.*/

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false

class MyTv {
    static boolean isPowerOn = false;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    void turnOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        boolean po = isPowerOn;
        if (po == true) {
            po = false;
        } else {
            po = true;
        }
    }
    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if (volume < MAX_VOLUME){
            volume += 1;
        }
    }
    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if (volume>MIN_VOLUME){
            volume -= 1;
        }
    }
    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
        if (channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }else {
            channel+= 1;
        }
    }
    void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if (channel == MIN_CHANNEL){
            channel = MAX_CHANNEL;
        }else {
            channel -= 1;
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

import java.util.Arrays;

class Exercise6_20 {
    /* (1) max 메서드를 작성하시오 . */
    static int max(int[] arr) {
        int result;
        if (arr == null || arr.length == 0){
            result = -99999;
        }else {

            Arrays.sort(arr);
            result = arr[arr.length -1];


        }
        return result;
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
    static int abs(int abs){
        if (abs > 0){

        }else {
            abs = -abs;
        }
        return abs;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10