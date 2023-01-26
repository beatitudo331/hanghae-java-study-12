package kimjuhui.solid.lsp;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {

        return firstNumber / secondNumber;
    }

    @Override
    public boolean isInvalid(int secondNumber) {
        if (secondNumber == 0) {
            return true;
        }
        return false;
    }
}
