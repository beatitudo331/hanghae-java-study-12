package solid.lsp;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
        return true;
    }

}
