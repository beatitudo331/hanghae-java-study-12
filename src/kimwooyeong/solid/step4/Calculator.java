package kimwooyeong.solid.step4;

public class Calculator {
    public int calculate(AbstractOperation operation, int firstNumber, int secondNumber){
        if (operation.den(secondNumber))
            return -99999;
        return operation.operate(firstNumber, secondNumber);
    }

}

