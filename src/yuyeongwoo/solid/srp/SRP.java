package yuyeongwoo.solid.srp;

public class SRP {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation(), new SubtractOperation(), new MultiplyOperation(), new DivideOperation());
        int firNum = 4;
        int secNum = 2;
        calculator.add(firNum, secNum);
        calculator.divide(firNum, secNum);
        calculator.subtract(firNum, secNum);
        calculator.multiply(firNum, secNum);
    }
}

class Calculator {
    AddOperation add;
    SubtractOperation subtract;
    MultiplyOperation multiply;
    DivideOperation divide;

    public Calculator(AddOperation add, SubtractOperation subtract, MultiplyOperation multiply, DivideOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

    public void add(int firstNumber, int secondNumber) {
        add.operate(firstNumber, secondNumber);
    }

    public void subtract(int firstNumber, int secondNumber) {
        subtract.operate(firstNumber, secondNumber);
    }

    public void multiply(int firstNumber, int secondNumber) {
        multiply.operate(firstNumber, secondNumber);
    }

    public void divide(int firstNumber, int secondNumber) {
        divide.operate(firstNumber, secondNumber);
    }
}

class AddOperation {

    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }
}

class SubtractOperation {
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));    }
}

class MultiplyOperation {
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
    }
}

class DivideOperation {
    public void operate(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
    }
}
