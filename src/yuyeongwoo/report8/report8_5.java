package yuyeongwoo.report8;
//문제 7-5번
public class report8_5 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
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
class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    // (구현)
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        // (구현)
        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    // (구현)
    public void gotoPrevChannel() {
        setChannel(prevChannel);
    }
}
