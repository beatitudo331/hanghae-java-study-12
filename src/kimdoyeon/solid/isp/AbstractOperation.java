package kimdoyeon.solid.isp;

public abstract class AbstractOperation {
    public abstract int operate(int firstNum, int secondNum);
    public abstract boolean isInvalid(int secondNum);
    public abstract String getOperator();
}
