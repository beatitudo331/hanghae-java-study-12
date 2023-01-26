package kimjuhui.solid.ocp;

public class SubstractOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
}
