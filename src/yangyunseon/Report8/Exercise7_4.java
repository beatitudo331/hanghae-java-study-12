package yangyunseon.Report8;

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int ch) {
        channel = ch;
    }

    void setVolume(int vol) {
        volume = vol;
    }

    int getChannel() {
        return channel;
    }

    int getVolume() {
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
//예상결과) CH:10 VOL:20