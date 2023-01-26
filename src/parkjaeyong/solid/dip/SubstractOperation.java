package parkjaeyong.solid.dip;

import parkjaeyong.solid.isp.AbstractOperation;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    @Override
    public boolean isInvalid(int firstNumber, int secondNumber) {
        return true;
    }
    @Override
    public String getOperator() {
        return "-";
    }
}
