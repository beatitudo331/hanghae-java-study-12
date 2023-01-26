package parkjaeyong.solid.isp;

public class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
        return true;
    }
    @Override
    public String getOperator() {
        return "+";
    }
}
