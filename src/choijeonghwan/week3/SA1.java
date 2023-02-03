package week3;
class Transport{
    int num;
    int fare = 1500;
    int oil = 100;
    int velocity = 0;
    boolean currentStatus = true; // true : 운행중, false : 차고지행
    final int MAX_OIL = 100;
    final int MIN_OIL = 0;
    final int MAX_PASSENGER = 30;
    final int MIN_PASSENGER = 0;

    public Transport(int num) {
        this.num = num;
    }

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

    public void setPassenger(int passenger){
    }


static class Bus extends Transport {
    int passenger = 0;
    int currentPassenger = 0;

    public Bus(int num) {
        super(num);
    }

    @Override
    public void setStatus() {
        currentStatus = !currentStatus;
        if (oil < 10) {
            currentStatus = false;
        }
    }
    public void getStatus(){
        if (currentStatus){
            System.out.println("상태 : 운행중");
        }
        else{
            System.out.println("상태 : 차고지행");
        }
        System.out.println("주유량 = " + this.oil);
        if (oil < 10) {
            System.out.println("주유가 필요합니다.");
        }
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
            this.velocity = velocity;
        }
    }
    public int getVelocity(){
        return velocity;
    }
    @Override
    public void setPassenger(int passenger){
        if (this.passenger + passenger >= MAX_PASSENGER){
            System.out.println("최대 승객수를 초과했습니다.");
        }
        else if(!currentStatus){
            System.out.println("지금 운행중이 아닙니다.");
        }
        else {
            this.passenger += passenger;
            currentPassenger = passenger;
        }
    }
    public void getPassenger(){
        System.out.println("탑승 승객 수 = " + currentPassenger);
        System.out.println("잔여 승객 수 = " + (MAX_PASSENGER - passenger));
        System.out.println("요금 확인 = " + fare);
    }
    public void setOil(int oil){
        this.oil += oil;
        if (this.oil< 10) {
            setStatus();
        }
    }
    public void getOil(){
        System.out.println("주유량 = " + this.oil);
    }


}
}

class SA1 {
    public static void main(String args[]) {
        Transport.Bus bus1 = new Transport.Bus(1);
        Transport.Bus bus2 = new Transport.Bus(2);
        System.out.println(bus1.num + "번 버스 객체 만들어짐!");
        System.out.println(bus2.num + "번 버스 객체 만들어짐!");
        bus1.setPassenger(2);  // #1
        bus1.getPassenger(); // #2
        bus1.setOil(-50);  // #3
        bus1.getOil(); // #4
        bus1.setStatus();  // #5
        bus1.setOil(10);  // #6
        bus1.getStatus();  // #7
        bus1.setStatus();  // #8
        bus1.setPassenger(45); // #9 #10
        bus1.setPassenger(5); // #11
        bus1.getPassenger(); // #12
        bus1.setOil(-55); // #13
        bus1.getStatus(); // #14 #15
    }
}
