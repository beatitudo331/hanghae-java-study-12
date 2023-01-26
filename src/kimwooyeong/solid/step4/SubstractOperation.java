package kimwooyeong.solid.step4;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public String getOperator() {
        return "-";
    }

    @Override
    public boolean den(int secondNumber){
        return false;
    }
}
