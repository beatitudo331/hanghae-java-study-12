package leesangwon.report8;
// 7-4번 문제
class MyTv {
    private boolean isPowerOn;  //private 같은 클래스 내에서만 접근이 가능하다.
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume) {
        if(volume>MAX_VOLUME || volume<MIN_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setChannel(int channel) {
        if(channel>MAX_CHANNEL || channel<MIN_CHANNEL)
            return;
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }

}

class Report8_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
//예상결과) CH:10 VOL:20