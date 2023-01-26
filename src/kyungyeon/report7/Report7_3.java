package kyungyeon.report7;

// 6-19. Tv클래스를 주어진 로직대로 완성하세요.
// 완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하세요.

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
            volume += 1;
        }
    }

    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
        if (volume > MIN_VOLUME) {
            volume -= 1;
        }
    }

    void channelUp() {
        // (4) channel의 값을 1 증가시킨다.
        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
        if (channel != MAX_CHANNEL) {
            channel += 1;
        } else {
            channel = MIN_CHANNEL;
        }
    }

    void channelDown() {
        // (5) channel의 값을 1 감소시킨다 .
        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
        if (channel != MIN_CHANNEL) {
            channel -= 1;
        } else {
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
