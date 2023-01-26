package hanseunghyeon.SOLID;

class Client_3 {
    public static void main(String[] args) {

        Calculator_3 calculator = new Calculator_3();

        int firNum = 140;
        int secNum = 70;

        int answer = calculator.calculate(new AddOperation_3(), firNum, secNum);
        System.out.println(" + answer = " + answer);

        answer = calculator.calculate(new SubstractOperation_3(), firNum, secNum);
        System.out.println(" - answer = " + answer);

        answer = calculator.calculate(new MultiplyOperation_3(), firNum, secNum);
        System.out.println(" * answer = " + answer);

        answer = calculator.calculate(new DivideOperation_3(), firNum, secNum);
        System.out.println(" / answer = " + answer);
    }
}

class Calculator_3 {
    // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
    public int calculate(AbstractOperation_3 operation, int firstNumber, int secondNumber) {
        return operation.checkOperation(firstNumber, secondNumber);
    }
}

abstract class AbstractOperation_3 {
    public abstract int operate(int firstNumber, int secondNumber);
    public int checkOperation(int firstNumber, int secondNumber){
        if(this instanceof DivideOperation_3){
            if(secondNumber == 0){
                return -99999;
            }
        }
        return this.operate(firstNumber, secondNumber);
    }
}

class AddOperation_3 extends AbstractOperation_3 {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

class SubstractOperation_3 extends AbstractOperation_3 {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}

class MultiplyOperation_3 extends AbstractOperation_3 {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}

class DivideOperation_3 extends AbstractOperation_3 {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}