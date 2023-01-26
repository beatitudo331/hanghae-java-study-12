package yuyeongwoo.solid.lsp;

public class DivideOperation extends AbstractOperation {

    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public int isInvalid(AbstractOperation operation, int firstNumber, int secondNumber) {
        if (operation instanceof DivideOperation) {
            if (secondNumber == 0) {
                return -9999;
            }
        }
        return operation.operate(firstNumber, secondNumber);
    }
}
