package Leesanghoon.solid.LSP;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public String getOperator() {
        return "-";
    }
}
