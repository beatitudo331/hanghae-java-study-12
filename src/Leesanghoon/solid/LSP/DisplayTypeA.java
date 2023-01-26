package Leesanghoon.solid.LSP;

// 연산 결과만 출력
public class DisplayTypeA extends Calculator implements Display {

    @Override
    public void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) {
        int answer = operation.operate(firstNumber, secondNumber);
        System.out.println(answer);
    }

    @Override
    public void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception {
        throw new Exception("동작 불가");
    }
}
