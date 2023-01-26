package yuyeongwoo.solid.dip;

public class AddOperation extends AbstractOperation {
    @Override
    public int operate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
