package week3;
class Transport {
    int fare;
    int num;
    int oil = 100;
    int velocity = 0;
    boolean currentStatus = true; // true : 운행중, false : 차고지행
    final int MAX_OIL = 100;
    final int MIN_OIL = 0;
    final int MAX_PASSENGER = 100;
    final int MIN_PASSENGER = 0;

    public void setStatus() {
        if (currentStatus) {
            if (oil < 10) {
                System.out.println("주유량을 확인해주세요.");
            }
            else{
                currentStatus = false;
            }
        }
        else {
            currentStatus = true;
        }
    }
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }

    public void setPassenger(){
    }


static class Bus extends Transport {
    int passenger = 0;

    public Bus() {
        super();
    }

    @Override
    public void setStatus() {
        if (currentStatus) {
            currentStatus = false;
        }
        else {
            currentStatus = true;
        }
        if (oil < 10) {
            System.out.println("주유가 필요합니다.");
            currentStatus = false;
        }
    }
    public void getStatus(){
        if (currentStatus){
            System.out.println("운행중");
        }
        else{
            System.out.println("차고지행");
        };
    }
    @Override
    public void setVelocity(int velocity){
        if (oil < 10 ){
            System.out.println("주유량을 확인해주세요.");
        }
        else if(!currentStatus){
            System.out.println("지금 운행중이 아닙니다.");
        }
        else {
            super.velocity = velocity;
        }
    }
    public int getVelocity(){
        return velocity;
    }
    @Override
    public void setPassenger(){
        if (passenger >= MAX_PASSENGER){
            System.out.println("탑승 가능한 최대 승객수를 초과하였습니다.");
            return;
        }
        else if(!currentStatus){
            System.out.println("지금 운행중이 아닙니다.");
            return;
        }
        passenger ++;
    }
    public int getPassenger(){
        return passenger;
    }



}
}

class SA1 {
    public static void main(String args[]) {
        Transport.Bus bus = new Transport.Bus();
        bus.setStatus(); // 차고지행으로 변경
        bus.getStatus();
        bus.setStatus(); // 운행중으로 변경
        bus.getStatus();
        bus.setVelocity(20);
        System.out.println("Velocity:" + bus.getVelocity());
        bus.setPassenger();
        System.out.println("Passenger:" + bus.getPassenger());
    }
}
