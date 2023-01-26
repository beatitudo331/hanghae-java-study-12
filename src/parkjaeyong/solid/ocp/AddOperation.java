package parkjaeyong.solid.ocp;

public class AddOperation extends AbstractOperation{
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
