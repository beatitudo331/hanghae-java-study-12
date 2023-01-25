package limminseong.report8;

// 8-4번 MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
// 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라
class MyTv8_4 {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)
    // 정답:
    MyTv8_4() {
        isPowerOn = false;
        channel = MIN_CHANNEL;
        volume = MIN_VOLUME;
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
            this.channel = channel;
        }
    }

    public int getChannel() {
        return channel;
    }
}

class Exercise8_4 {
    public static void main(String args[]) {
        MyTv8_4 t = new MyTv8_4();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20