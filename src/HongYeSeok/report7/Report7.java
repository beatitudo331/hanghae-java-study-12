package HongYeSeok.report7;

import java.util.Random;


public class Report7 {

}

// 6-17번 문제
class Exercise6_17 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int tmp;
            int randomNumber = random.nextInt(9) + 1;
            tmp = arr[i];
            arr[i] = arr[randomNumber];
            arr[randomNumber] = tmp;
        }
        return arr;
    }
}

//6-18번 문제
class Exercise6_18 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }

    public static boolean isNumber(String str) {
        //
        //주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
        //모두 숫자로만 이루어져있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
        //만일 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
        //

        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false

//6-19번 문제
//Tv클래스를 주어진 로직대로 완성하세요. 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하세요.
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
        isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
        channel++;
        if (channel > MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
    }

    void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        channel--;
        if (channel < MIN_CHANNEL) {
            channel = MAX_CHANNEL;
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

//6-20번 문제

class Exercise6_20 {
    /* (1) max 메서드를 작성하시오 . */
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :" + max(data));
        System.out.println("최대값 :" + max(null));
        System.out.println("최대값  :" + max(new int[]{})); // 크기가 0인 배열  }
    }

    public static int max(int[] arr) {
        //주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
        //만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다

        if (arr == null || arr.length == 0) {
            return -999999;
        }

        int maxNumber = arr[0];

        for (int j : arr) {
            maxNumber = Math.max(maxNumber, j);
        }
        return maxNumber;
    }
}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999

class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
    public static int abs(int value){
        if(value < 0){
            return value*-1;
        }
        return value;
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10