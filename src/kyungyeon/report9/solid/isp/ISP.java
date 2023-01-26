package kyungyeon.report9.solid.isp;

//    필요하지 않은 기능을 강제로 구현하고 있습니다.
//    사용하지 못하도록 예외처리를 구현하고 있습니다.

//    원칙 적용 방법
//        필요하지 않은 기능을 강제로 구현하지 않도록 인터페이스를 분리합니다.
//        연산 결과를 보여주는 방법마다 인터페이스를 구현합니다.
//        DisplayResult : 인터페이스, 연산결과만 출력
//            displayResult : 추상 메서드
//        DisplayWithOperator : 인터페이스, 연산과정 포함 출력
//            displayResultWithOperator : 추상 메서드

class Calculator {
    int calculate(AbstractOperation operation, int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}

class Client {
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

abstract class AbstractOperation {
    abstract int operate(int firstNumber, int secondNumber);
    abstract String getOperator();
}

interface DisplayResult {
    abstract void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception;
}

interface DisplayWithOperator {
    abstract void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception;
}

// 연산 결과만 출력
class DisplayTypeA extends Calculator implements DisplayResult {

    @Override
    public void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = operation.operate(firstNumber, secondNumber);
        System.out.println(answer);
    }
}

// 연산 과정을 포함한 출력
class DisplayTypeB extends Calculator implements DisplayWithOperator {

    @Override
    public void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = operation.operate(firstNumber, secondNumber);
        String operator = operation.getOperator();
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
    }
}

class AddOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    String getOperator() {
        return "+";
    }
}

class SubstractOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    String getOperator() {
        return "-";
    }
}

class MultiplyOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    String getOperator() {
        return "*";
    }
}

class DivideOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    String getOperator() {
        return "/";
    }
}