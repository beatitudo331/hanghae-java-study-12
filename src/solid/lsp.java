package solid;

public class lsp {
 class Client {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

        int answer = calculator.calculate(new AddOperation(), firNum, secNum);
        System.out.println(" + answer = " + answer);

        answer = calculator.calculate(new SubstractOperation(), firNum, secNum);
        System.out.println(" - answer = " + answer);

        answer = calculator.calculate(new MultiplyOperation(), firNum, secNum);
        System.out.println(" * answer = " + answer);

        answer = calculator.calculate(new DivideOperation(), firNum, secNum);
        System.out.println(" / answer = " + answer);
    }
}
 class Calculator {

    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        // 나누기 연산 - 0처리 추가
        if(operation instanceof DivideOperation){
            if(secondNumber == 0){
                throws Exception;
            }
        }
        return operation.operate(firstNumber, secondNumber);
    }
}
 abstract class AbstractOperation { // 연산 기능을 추상화된 부모클래스에 의존하여 처리한다.
     public abstract int operate(int firstNumber, int secondNumber);
 }
 class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}

 class MultiplyOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
 class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
 class SubstractOperation extends AbstractOperation {
     @Override
     public int operate(int firstNumber, int secondNumber) {
         return firstNumber - secondNumber;
     }
 }




}
