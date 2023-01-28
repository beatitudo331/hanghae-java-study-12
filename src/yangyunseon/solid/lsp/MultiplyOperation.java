package yangyunseon.solid.lsp;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public int isInvalid(int firstNumber, int secondNumber) {
        return operate(firstNumber,secondNumber);
    }
}