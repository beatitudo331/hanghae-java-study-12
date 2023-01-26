package parkjaeyong.solid.ocp;

public class MultiplyOperation extends AbstractOperation{
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
