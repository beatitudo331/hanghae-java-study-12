package kimwooyeong.solid.step2;

public class DivideOperation extends AbstractOperation {
    public int operate(int firstNumber, int secondNumber){
        if(secondNumber == 0)
            return -1;
        return firstNumber / secondNumber;
    }
}