package kimdonghyeon.solid.step4;
class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber){
        return false;
    }

    @Override
    public String getOperator() {
        return "+";
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

    @Override
    public String getOperator() {
        return "-";
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

    @Override
    public String getOperator() {
        return "*";
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

    @Override
    public String getOperator() {
        return "/";
    }
}

abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);

    public abstract String getOperator();

    public abstract boolean isInvalid(int firstNumber, int secondNumber);
}

public class Calculator {
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber){
        return operation.operate(firstNumber, secondNumber);
    }
}
