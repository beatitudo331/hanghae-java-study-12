package Leesanghoon.solid.DIP;

public class Calculator {
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation, MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public int add(int firstNumber, int secondNumber){
        return addOperation.operate(firstNumber, secondNumber);
    }

    public int substract(int firstNumber, int secondNumber){
        return substractOperation.operate(firstNumber, secondNumber);
    }

    public int multiply(int firstNumber, int secondNumber){
        return multiplyOperation.operate(firstNumber, secondNumber);
    }

    public int divide(int firstNumber, int secondNumber){
        return divideOperation.operate(firstNumber, secondNumber);
    }
}