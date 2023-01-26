package yuyeongwoo.solid.lsp;

public class Calculator {
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return operation.isInvalid(operation, firstNumber, secondNumber);
    }
}
