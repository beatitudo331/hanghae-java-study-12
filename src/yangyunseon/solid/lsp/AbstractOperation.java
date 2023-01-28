package yangyunseon.solid.lsp;

public abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);

    public abstract int isInvalid(int firstNumber, int secondNumber);
}