package kimdoyeon.report8;
// 7-4 번 문제
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL)
            this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME)
            this.volume = volume;
    }
}

class Exercise7_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20