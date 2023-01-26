package Kimjinwon.report8;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)
    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public void setChannel(int channel){
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
            return;
        this.channel = channel;
    }

    public void setVolume(int volume){
        if (volume < MIN_VOLUME || volume > MAX_VOLUME)
            return;
        this.volume = volume;
    }

}


public class Report8_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
