package solid.srp;

public class Calculator {
    AddOperation addOperation;
    SubstractOperation substractOperation;
    MultiplyOperation multiplyOperation;
    DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public int add(int firstNumber, int secondNumber) {
        return addOperation.operate(firstNumber, secondNumber);
    }

    public int substract(int firstNumber, int secondNumber) {
        return substractOperation.operate(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber) {
        return multiplyOperation.operate(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber) {
        return divideOperation.operate(firstNumber, secondNumber);
    }

}

class AddOperation {
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}

class DivideOperation {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}
