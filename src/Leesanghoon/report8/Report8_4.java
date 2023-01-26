package Leesanghoon.report8;

//7-4번 문제
class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
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