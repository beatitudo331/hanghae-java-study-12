package kimjuhui.solid.isp;

public class Client {
    public static void main(String[] args) throws Exception {
        int firNum = 140;
        int secNum = 60;

        // 연산 결과만 출력
        DisplayTypeA displayTypeA = new DisplayTypeA();
        displayTypeA.displayResult(new AddOperation(), firNum, secNum);
        // displayTypeA.displayResultWithOperator(new AddOperation(), firNum, secNum); // Error 발생

        // 연산 과정까지 출력
        DisplayTypeB displayTypeB = new DisplayTypeB();
        displayTypeB.displayResultWithOperator(new AddOperation(), firNum, secNum);
        // displayTypeB.displayResult(new AddOperation(), firNum, secNum); // Error 발생
    }
}