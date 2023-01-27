package LeeJaeHun.solid.lsp;

class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public boolean isInvalid(int secondNumber) {
        return false;
    }
}
