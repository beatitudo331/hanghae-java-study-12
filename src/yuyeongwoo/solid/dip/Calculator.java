package yuyeongwoo.solid.dip;

public class Calculator {

    AbstractOperation operation = new AddOperation();

    int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return operation.operate(operation, firstNumber, secondNumber);
    }
}
