package yuyeongwoo.solid.isp;

public class Client {
    public static void main(String[] args) {
        int firNum = 140;
        int secNum = 60;

        DisplayResult displayResult = new DisplayTypeA();
        displayResult.displayResult(new AddOperation(), firNum, secNum);

        DisplayWithOperator displayWithOperator = new DisplayTypeB();
        displayWithOperator.displayResultWithOperator(new AddOperation(), firNum, secNum);
    }
}
