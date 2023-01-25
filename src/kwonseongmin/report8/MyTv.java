package kwonseongmin.report8;

public class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    // (구현)

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }
}
