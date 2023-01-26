package kimwooyeong.solid.step3;

public class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public boolean den(int secondNumber){
        return false;
    }
}