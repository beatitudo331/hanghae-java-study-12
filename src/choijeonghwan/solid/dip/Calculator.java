package solid.dip;

public class Calculator {
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
abstract class AbstractOperation {
    public abstract int operate(int firstNumber, int secondNumber);}