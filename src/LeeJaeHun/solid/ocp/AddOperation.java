package LeeJaeHun.solid.ocp;

class AddOperation extends AbstractOperation  {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }
}
