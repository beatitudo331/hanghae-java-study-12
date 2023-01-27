package LeeJaeHun.solid.dip;

public class Calculator {

    public int calculate(AbstractOperation operator, int firstNumber, int secondNumber) {


        return operator.operate(firstNumber,secondNumber);
    }
}