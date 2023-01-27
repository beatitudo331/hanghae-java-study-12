package LeeJaeHun.solid.ocp;

class DivideOperation extends AbstractOperation  {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber/secondNumber;
    }
}