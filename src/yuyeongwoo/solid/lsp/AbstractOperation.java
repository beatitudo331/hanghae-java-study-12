package yuyeongwoo.solid.lsp;

public abstract class AbstractOperation {
    abstract int operate(int firstNumber, int secondNumber);

    abstract int isInvalid(AbstractOperation operation, int firstNumber, int secondNumber);
}
