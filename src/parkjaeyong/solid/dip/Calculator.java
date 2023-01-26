package parkjaeyong.solid.dip;

import parkjaeyong.solid.isp.AbstractOperation;

public class Calculator {
    AbstractOperation operator;

    public Calculator(AbstractOperation operator) {
        this.operator = operator;
    }

    public int calculate(int firstNumber, int secondNumber) {
        if(!operator.isInvalid(firstNumber,secondNumber))
            return -999999999;
        return operator.operate(firstNumber,secondNumber);
    }

    public void setOperator(AbstractOperation operator) {
        this.operator = operator;
    }
}