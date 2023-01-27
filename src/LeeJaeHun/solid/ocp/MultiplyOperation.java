package LeeJaeHun.solid.ocp;

class MultiplyOperation  extends AbstractOperation  {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber*secondNumber;
    }
}