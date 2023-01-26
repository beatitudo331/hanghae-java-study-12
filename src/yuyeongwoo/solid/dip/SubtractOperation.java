package yuyeongwoo.solid.dip;

public class SubtractOperation extends AbstractOperation{
    @Override
    public int operate(AbstractOperation operation, int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
