package kyungyeon.report8;

//    7-4. MyTv클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고
//        대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.

//    7-5. 문제7-4에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는 기능 의 메서드를 추가해서
//        실행결과와 같은 결과를 얻도록 하시오.
//
//            [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
//        메서드명 : gotoPrevChannel
//        기 능 : 현재 채널을 이전 채널로 변경한다.
//        반환타입 : 없음
//        매개변수 : 없음

class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;


    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void setChannel(int num){
        this.channel = num;
    }

    void setVolume(int num){
        this.volume = num;
    }

    int getChannel(){
        return this.channel;
    }

    int getVolume(){
        return this.volume;
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
