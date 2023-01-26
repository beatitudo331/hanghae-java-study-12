package kimdoyeon.solid.isp;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public boolean isInvalid(int secondNum) {
        return true;
    }

    @Override
    public String getOperator() {
        return "*";
    }
}
