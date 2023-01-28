package yangyunseon.solid.lsp;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int isInvalid(int firstNumber, int secondNumber) {
        return operate(firstNumber,secondNumber);
    }
}