package yuyeongwoo.solid.lsp;

public class MultiplyOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public int isInvalid(AbstractOperation operation, int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
