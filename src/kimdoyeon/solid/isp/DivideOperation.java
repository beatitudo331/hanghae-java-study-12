package kimdoyeon.solid.isp;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public boolean isInvalid(int secondNum) {
        return secondNum != 0;
    }

    @Override
    public String getOperator() {
        return "/";
    }
}
