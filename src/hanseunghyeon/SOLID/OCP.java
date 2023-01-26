package hanseunghyeon.SOLID;

class Client_2 {
    public static void main(String[] args) {
        Calculator_2 calculator = new Calculator_2();
        int firstNum = 140;
        int secNum = 60;

        System.out.println("Add : "+ calculator.calculate(firstNum,secNum,new AddOperation_2()));
        System.out.println("Substract : "+ calculator.calculate(firstNum,secNum,new SubstractOperation_2()));
        System.out.println("Multiple : "+ calculator.calculate(firstNum,secNum,new MultiplyOperation_2()));
        System.out.println("Divide : "+ calculator.calculate(firstNum,secNum,new DivideOperation_2()));
    }
}

class Calculator_2 {
    public int calculate(int firstNum, int secondNum, AbstractOperation_2 op){
        return op.operate(firstNum,secondNum);
    }
}

abstract class AbstractOperation_2 {
    abstract int operate(int firstNumber, int secondNumber);
}

class AddOperation_2 extends AbstractOperation_2{
    public int operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}

class SubstractOperation_2 extends AbstractOperation_2 {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation_2 extends AbstractOperation_2 {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}

class DivideOperation_2 extends  AbstractOperation_2 {
    public int operate(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
}