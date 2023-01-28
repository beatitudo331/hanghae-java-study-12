package yangyunseon.solid.ocp;

class Calculator {

    AbstractOperation addOperation = new AddOperation();
    AbstractOperation substractOperation = new SubstractOperation();
    AbstractOperation multiplyOperation = new MultiplyOperation();
    AbstractOperation divideOperation = new DivideOperation();


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