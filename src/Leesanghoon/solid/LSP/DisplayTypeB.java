package Leesanghoon.solid.LSP;

// 연산 과정을 포함한 출력
public class DisplayTypeB extends Calculator implements Display {

    @Override
    public void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception {
        throw new Exception("동작 불가");
    }

    @Override
    public void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = operation.operate(firstNumber, secondNumber);
        String operator = operation.getOperator();
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
    }
}
