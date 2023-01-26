package kimdoyeon.solid.ocp;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}
