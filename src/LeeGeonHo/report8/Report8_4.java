package LeeGeonHo.report8;
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;

    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

// 7-4. MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라
// 7-5. 문제7-4에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 기능 의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        prevChannel = this.channel;
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME)
        this.volume = volume;
    }
    void gotoPrevChannel(){setChannel(prevChannel);}
    }



class Report8_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
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
//예상결과) CH:10 VOL:20

