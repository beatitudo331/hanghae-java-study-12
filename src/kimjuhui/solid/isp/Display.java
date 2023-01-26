package kimjuhui.solid.isp;

public interface Display {
    public abstract void displayResult(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception;
    public abstract void displayResultWithOperator(AbstractOperation operation, int firstNumber, int secondNumber) throws Exception;
}
