package kimdoyeon.solid.isp;

public class Client {
    public static void main(String[] args) {

        int firNum = 140;
        int secNum = 60;

        // 연산 결과만 출력
        DisplayTypeA displayTypeA = new DisplayTypeA();
        displayTypeA.displayResult(new AddOperation(), firNum, secNum);
        displayTypeA.displayResult(new SubstractOperation(), firNum, secNum);
        displayTypeA.displayResult(new MultiplyOperation(), firNum, secNum);
        displayTypeA.displayResult(new DivideOperation(), firNum, secNum);

        // 연산 과정까지 출력
        DisplayTypeB displayTypeB = new DisplayTypeB();
        displayTypeB.displayResultWithOperator(new AddOperation(), firNum, secNum);
        displayTypeB.displayResultWithOperator(new SubstractOperation(), firNum, secNum);
        displayTypeB.displayResultWithOperator(new MultiplyOperation(), firNum, secNum);
        displayTypeB.displayResultWithOperator(new DivideOperation(), firNum, secNum);
    }
}

