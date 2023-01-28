package yangyunseon.solid.lsp;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public int isInvalid(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return -99999;
        }
        return operate(firstNumber,secondNumber);
    }
}