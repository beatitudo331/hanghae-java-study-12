package Leesanghoon.solid.ISP;

public class AddOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public String getOperator() {
        return "+";
    }
}
