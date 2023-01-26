package yuyeongwoo.solid.dip;

public class MultiplyOperation extends AbstractOperation {
    @Override
    public int operate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
