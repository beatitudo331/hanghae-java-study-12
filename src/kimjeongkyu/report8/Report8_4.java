package kimjeongkyu.report8;

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

        // (구현)
        setPrevChannel(getChannel());
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public int getPrevChannel() {
        return prevChannel;
    }

    public void setPrevChannel(int prevChannel) {
        this.prevChannel = prevChannel;
    }
// (구현)

    /**
     * gotoPrevChannel
     * 현재 채널을 이전 채널로 변경한다.
     * 반환타입 : 없음
     * 매개변수 : 없음
     */
    public void gotoPrevChannel() {
        int tmp = getChannel();
        setChannel(getPrevChannel());
        setPrevChannel(tmp);
    }
}

class Exercise7_5 {
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
