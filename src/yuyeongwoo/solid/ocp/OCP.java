package yuyeongwoo.solid.ocp;

public class OCP {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int firNum = 4;
        int secNum = 2;
        calculator.calculate(new AddOperation(), firNum, secNum);
        calculator.calculate(new SubtractOperation(), firNum, secNum);
        calculator.calculate(new MultiplyOperation(), firNum, secNum);
        calculator.calculate(new DivideOperation(), firNum, secNum);
    }
}

class Calculator {
    public void calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        operation.operate(firstNumber, secondNumber);
    }
}

abstract class AbstractOperation {
    abstract void operate(int firstNumber, int secondNumber);
}

class AddOperation extends AbstractOperation {

    @Override
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }
}

class SubtractOperation extends AbstractOperation {

    @Override
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));    }
}

class MultiplyOperation extends AbstractOperation {

    @Override
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}

class DivideOperation extends AbstractOperation {

    @Override
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}