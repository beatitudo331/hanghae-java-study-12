package kimNahyun.report8;

// 7-5 번 문제
class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    // (구현)

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

        this.prevChannel = this.channel;
        this.channel = channel;
        //이전 값을 prevChannel에 복사 저장하고 channel에는 바뀐 값을 넣음
    }

    public int getChannel() {
        return channel;
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);
        //prevChannel에는 이전값이 들어있다.
    }
}
public class Report8_5 {
    public static void main(String args[]) {
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
// CH:10
// CH:20
// CH:10
// CH:20