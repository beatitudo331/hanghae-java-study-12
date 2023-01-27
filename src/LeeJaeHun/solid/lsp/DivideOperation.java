package LeeJaeHun.solid.lsp;

class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }

    @Override
    public boolean isInvalid(int secondNumber) {
        return secondNumber ==0;
    }
}