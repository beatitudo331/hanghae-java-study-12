package kimdaewook.report7;

public class Report7_1 {
    /*shuffle 메서드를 작성하세요. */
//    메서드명 : shuffle
//            기능
//    주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//    처리한 배열을 반환한다.
//            반환타입 : int[]
//    매개변수 : int[] arr - 정수값이 담긴 배열
    static int[] shuffle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            int tmp = 0;
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
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

class Exercise7_2 {

    /*isNumber 메서드를 작성하세요.*/
//    메서드명 : isNumber
//            기능
//    주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
//    모두 숫자로만 이루어져있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
//    만일 주어진 문자열이 null이거나 빈문자열 ""이라면 false를 반환한다.
//            반환타입 : boolean
//    매개변수 : String str - 검사할 문자열
//            (힌트) String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
    static boolean isNumber(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 58 && str.charAt(i) > 48) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}

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
        this.isPowerOn = !isPowerOn;
    }

    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
        if (this.volume < MAX_VOLUME) {
            this.volume++;
        }
    }

    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if (this.volume > MAX_VOLUME) {
            this.volume--;
        }
    }

    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
        if (this.channel == MAX_CHANNEL) {
            this.channel = MIN_CHANNEL;
        } else {
            this.channel++;
        }
    }

    void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if (this.channel == MIN_CHANNEL) {
            this.channel = MAX_CHANNEL;
        } else {
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

class Exercise6_20 {
    /* (1) max 메서드를 작성하시오 . */
//    메서드명 : max
//            기능
//    주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
//    만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
//    반환타입 : int
//    매개변수 : int[] arr - 최대값을 구할 배열
    static int max(int[] arr) {
        int maxValue = -999999;
        if (arr == null || arr.length == 0)
            return maxValue;

        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :" + max(data));
        System.out.println("최대값 :" + max(new int[]{})); // 크기가 0인 배열  }
        System.out.println("최대값 :" + max(null));
    }
}

//메서드명: abs
//        기능 : 주어진 값의 절대값을 반환한다.
//        반환타입 : int
//        매개변수 : int value
class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    static int abs(int value) {

//        return Math.abs(value);
        return value < 0 ? value * -1 : value * 1;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10