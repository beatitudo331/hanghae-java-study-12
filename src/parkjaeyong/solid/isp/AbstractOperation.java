package parkjaeyong.solid.isp;

public abstract class AbstractOperation {

    public abstract int operate(int firstNumber, int secondNumber);

    public abstract boolean isInvalid(int firstNumber, int secondNumber);

    public abstract String getOperator();
}
