package kimdonghyeon.solid.step1;

class AddOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}

public class Calculator {
    private AddOperation addOperation = new AddOperation();
    private SubstractOperation substractOperation = new SubstractOperation();
    private MultiplyOperation multiplyOperation = new MultiplyOperation();
    private DivideOperation divideOperation = new DivideOperation();

    public Calculator() {
    }

    public int calculate(String operator, int firstNumber, int secondNumber) {
        int answer = 0;

        if (operator.equals("+")) {
            answer = addOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("-")) {
            answer = substractOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("*")) {
            answer = multiplyOperation.operate(firstNumber, secondNumber);
        } else if (operator.equals("/")) {
            answer = divideOperation.operate(firstNumber, secondNumber);
        }

        return answer;
    }
}
