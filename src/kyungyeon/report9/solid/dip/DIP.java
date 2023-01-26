package kyungyeon.report9.solid.dip;

//    계산기(고수준 모듈)가 개별 연산 클래스(저수준 모듈)을 포함하며,
//    계산 기능을 구현할 때 연산 클래스에 의존하고 있습니다.

//    원칙 적용 방법
//        고수준 모듈의 변화되는 부분을 추상화합니다.
//        저수준 모듈을 추상화에 의존시킵니다.
//        계산기 클래스에 추상화된 부모 클래스를 포함시킵니다.
//        연산 클래스는 추상화된 부모 클래스를 상속받아 기능별로 구현합니다.
//        AbstractOperation : 추상 클래스
//            operate : 추상 메서드

class Calculator {
    private AbstractOperation abstractOperation;

    public int calculate(String operator, int firstNumber, int secondNumber) {
        if (operator.equals("+")) {
            abstractOperation = new AddOperation();
        } else if (operator.equals("-")) {
            abstractOperation = new SubstractOperation();
        } else if (operator.equals("*")) {
            abstractOperation = new MultiplyOperation();
        } else if (operator.equals("/")) {
            abstractOperation = new DivideOperation();
        }

        return abstractOperation.operate(firstNumber, secondNumber);
    }
}

class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

        String operator = "+";
        int answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}

abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);
}

class AddOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return -999999;
        }
        return firstNumber / secondNumber;
    }
}
