package kimdonghyeon.solid.step3;

class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber){
        return false;
    }
}

class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber){
        return false;
    }
}

class MultiplyOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber){
        return false;
    }
}

class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
            return firstNumber / secondNumber;
    }

    @Override
    public boolean isInvalid(int firstNumber, int secondNumber){
        if(secondNumber == 0)
            return true;

        return false;
    }
}

abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);

    public abstract boolean isInvalid(int firstNumber, int secondNumber);
}

public class Calculator {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        // 나누기 연산 - 0처리 추가

        if(operation.isInvalid(firstNumber, secondNumber))
            return -99999;

        return operation.operate(firstNumber, secondNumber);
    }
}
