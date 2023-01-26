package kimdonghyeon.solid.step5;

class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
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
    public boolean isInvalid(int firstNumber, int secondNumber) {
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
    public boolean isInvalid(int firstNumber, int secondNumber) {
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
    public boolean isInvalid(int firstNumber, int secondNumber) {
        if (secondNumber == 0)
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
    AbstractOperation abstractOperation;

    public Calculator() {
    }

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if (operator.equals("+")) {
            abstractOperation = new AddOperation();
        } else if (operator.equals("-")) {
            abstractOperation = new SubstractOperation();
        } else if (operator.equals("*")) {
            abstractOperation = new MultiplyOperation();
        } else if (operator.equals("/")) {
            abstractOperation = new DivideOperation();
        }
        answer = abstractOperation.operate(firstNumber, secondNumber);
        return answer;

    }
}

