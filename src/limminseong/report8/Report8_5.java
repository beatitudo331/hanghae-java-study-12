package limminseong.report8;

// 8-5번 문제 8-4에서 작성한 MyTv8_4클래스에 이전 채널(previous channel)로 이동하는 기능 의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
class MyTv8_5 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    final int PREVIOUS_CHANNEL_INIT = -1;

    // (구현)
    // 정답:
    MyTv8_5() {
        isPowerOn = false;
        channel = MIN_CHANNEL;
        volume = MIN_VOLUME;
        prevChannel = PREVIOUS_CHANNEL_INIT;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }

    public boolean getIsPowerOn() {
        return isPowerOn;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL) {
            prevChannel = this.channel;
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }

    // (구현)
    // 정답:
    public void gotoPrevChannel() {
        if (prevChannel != PREVIOUS_CHANNEL_INIT) {
            int temp = channel;
            channel = prevChannel;
            prevChannel = temp;
        }
    }
}

class Exercise7_5 {
    public static void main(String args[]) {
        MyTv8_5 t = new MyTv8_5();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}

// CH:10
// CH:20
// CH:10
// CH:20
